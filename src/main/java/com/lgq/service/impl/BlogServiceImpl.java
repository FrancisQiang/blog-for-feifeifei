package com.lgq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lgq.constant.Constants;
import com.lgq.dao.BlogMapper;
import com.lgq.dao.BlogTagMapper;
import com.lgq.dao.TagMapper;
import com.lgq.domain.*;
import com.lgq.dto.*;
import com.lgq.exception.BlogException;
import com.lgq.service.BlogService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.util.RedisUtil;
import com.lgq.vo.BlogAddVO;
import com.lgq.vo.BlogUpdateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {

    private final BlogMapper blogMapper;
    private final TagMapper tagMapper;
    private final BlogTagMapper blogTagMapper;
    private final RedisUtil redisUtil;
    private final int totalPageSize = 3;

    @Autowired
    @SuppressWarnings("all")
    public BlogServiceImpl(BlogMapper blogMapper, TagMapper tagMapper, BlogTagMapper blogTagMapper,
                           RedisUtil redisUtil) {
        this.blogMapper = blogMapper;
        this.tagMapper = tagMapper;
        this.blogTagMapper = blogTagMapper;
        this.redisUtil = redisUtil;
    }

    @Override
    @Transactional(rollbackForClassName = "Exception.class")
    public String addBlog(BlogAddVO blogAddVO) throws BlogException {
        List<Integer> tags = blogAddVO.getTags();
        BlogWithBLOBs blogWithBLOBs = new BlogWithBLOBs();
        Date date = new Date();
        blogWithBLOBs.setBlogUpdateTime(date);
        if (blogAddVO.getBlogContent().length() > 150) {
            blogWithBLOBs.setBlogSummary(blogAddVO.getBlogContent().substring(0, 150));
        } else {
            blogWithBLOBs.setBlogSummary(blogAddVO.getBlogContent());
        }
        blogWithBLOBs.setBlogCreateTime(date);
        blogWithBLOBs.setBlogTitle(blogAddVO.getBlogTitle());
        blogWithBLOBs.setBlogContent(blogAddVO.getBlogContent());
        blogWithBLOBs.setBlogCategoryId(blogAddVO.getBlogCategoryId());
        blogWithBLOBs.setBlogCover(blogAddVO.getBlogCover());
        int row = blogMapper.insertSelective(blogWithBLOBs);
        int addBlogId = blogWithBLOBs.getBlogId();
        for (Integer tagId : tags) {
            BlogTag blogTag = new BlogTag();
            blogTag.setBlogId(addBlogId);
            blogTag.setTagId(tagId);
            blogTagMapper.insertSelective(blogTag);
        }
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public PageInfoDTO<BlogGetDTO> getBlogList(Integer pageIndex) {
        Long totalPage = blogMapper.getBlogCount();
        List<BlogTag> blogTags = blogTagMapper.selectByExample(null);
        List<Tag> tags = tagMapper.selectByExample(null);
        PageHelper.startPage(pageIndex, totalPageSize);
        List<BlogPreGetDTO> blogList = blogMapper.getBlogList();
        List<BlogGetDTO> blogGetDTOS = new ArrayList<>();
        for (BlogPreGetDTO blogPreGetDTO : blogList) {
            BlogGetDTO blogGetDTO = new BlogGetDTO();
            BeanUtils.copyProperties(blogPreGetDTO, blogGetDTO);
            blogGetDTO.setBlogTags(new ArrayList<>());
            blogGetDTOS.add(blogGetDTO);
        }
        for (BlogTag blogTag : blogTags) {
            for (BlogGetDTO blogGetDTO : blogGetDTOS) {
                if (blogTag.getBlogId().equals(blogGetDTO.getBlogId())) {
                    for (Tag tag : tags) {
                        if (tag.getTagId().equals(blogTag.getTagId())) {
                            blogGetDTO.getBlogTags().add(tag);
                        }
                    }
                }
            }
        }
        PageInfo<BlogGetDTO> pageInfo = new PageInfo<>(blogGetDTOS);
        PageInfoDTO<BlogGetDTO> pageInfoDTO = new PageInfoDTO<>();
        pageInfoDTO.setSize(pageInfo.getSize());
        pageInfoDTO.setTotal(pageInfo.getTotal());
        int totalPageInt = 0;
        if (totalPage % totalPageSize != 0) {
            totalPageInt = totalPage.intValue() / totalPageSize + 1;
            pageInfoDTO.setTotalPage(totalPageInt);
        } else {
            totalPageInt = totalPage.intValue() / totalPageSize;
            pageInfoDTO.setTotalPage(totalPageInt);
        }
        if (pageIndex <= 0) {
            pageInfoDTO.setCurrentPage(1);
        } else if (pageIndex > totalPageInt) {
            pageInfoDTO.setCurrentPage(totalPageInt);
        } else {
            pageInfoDTO.setCurrentPage(pageIndex);
        }
        pageInfoDTO.setList(pageInfo.getList());
        return pageInfoDTO;
    }

    @Override
    public List<BlogGetByCategoryDTO> getBlogListByCategory(Integer categoryId) {
        return blogMapper.getBlogListByCategory(categoryId);
    }

    @Override
    public String deleteBlogById(Integer blogId) throws BlogException {
        BlogWithBLOBs blogWithBLOBs = new BlogWithBLOBs();
        blogWithBLOBs.setBlogId(blogId);
        blogWithBLOBs.setBlogDeleteFlag(true);
        int row = blogMapper.updateByPrimaryKeySelective(blogWithBLOBs);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    @Transactional(rollbackForClassName = "Exception.class")
    public BlogContentGetDTO getBlogById(Integer blogId) {
        redisUtil.incr(Constants.RedisKey.TOTAL_PAGE_VIEW);
        BlogContentPreGetDTO blogContentPreGetDTO = blogMapper.getBlogContentById(blogId);
        Long viewValue = redisUtil.hincr(Constants.RedisKey.BLOG_VIEW_MAP, blogId.toString(), 1);
        log.info(redisUtil.getString(Constants.RedisKey.EXPIRE_FLAG));
        if (redisUtil.getString(Constants.RedisKey.EXPIRE_FLAG) == null) {
            long currentTimeMillis = System.currentTimeMillis();
            redisUtil.set(Constants.RedisKey.EXPIRE_FLAG, currentTimeMillis, 10);
            BlogWithBLOBs blogWithBLOBs = new BlogWithBLOBs();
            blogWithBLOBs.setBlogId(blogId);
            blogWithBLOBs.setBlogViews(viewValue.intValue());
            blogMapper.updateByPrimaryKeySelective(blogWithBLOBs);
        }
        log.info(viewValue.toString());
        List<BlogTag> blogTags = blogTagMapper.selectByExample(null);
        List<Tag> tags = tagMapper.selectByExample(null);
        BlogContentGetDTO blogContentGetDTO = new BlogContentGetDTO();
        BeanUtils.copyProperties(blogContentPreGetDTO, blogContentGetDTO);
        blogContentGetDTO.setBlogTags(new ArrayList<>());
        for (BlogTag blogTag : blogTags) {
            if (blogTag.getBlogId().equals(blogContentGetDTO.getBlogId())) {
                for (Tag tag : tags) {
                    if (tag.getTagId().equals(blogTag.getTagId())) {
                        blogContentGetDTO.getBlogTags().add(tag);
                    }
                }
            }
        }
        return blogContentGetDTO;
    }

    @Override
    @Transactional(rollbackForClassName = "Exception.class")
    public String updateBlogById(BlogUpdateVO blog) throws BlogException {
        int row = blogMapper.updateByPrimaryKeySelective(blog);
        BlogTagExample blogTagExample = new BlogTagExample();
        blogTagExample.createCriteria().andBlogIdEqualTo(blog.getBlogId());
        blogTagMapper.deleteByExample(blogTagExample);
        for (Integer tag : blog.getTags()) {
            BlogTag blogTag = new BlogTag();
            blogTag.setTagId(tag);
            blogTag.setBlogId(blog.getBlogId());
            blogTagMapper.insertSelective(blogTag);
        }
        return CodeMessageUtil.updateMessage(row);
    }

    @Override
    public List<BlogCategoryNumDTO> getBlogCategoryNum() {
        return blogMapper.getBlogCategoryNum();
    }

    @Override
    public List<Integer> getMonthNum() {
        List<Date> createTimeList = blogMapper.selectCreateTimeList();
        List<Integer> monthNumList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            monthNumList.add(0);
        }
        for (Date dateItem : createTimeList) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateItem);
            int month = cal.get(Calendar.MONTH) + 1;
            monthNumList.set(month - 1, monthNumList.get(month - 1) + 1);
        }
        return monthNumList;
    }

    @Override
    public List<BlogViewNumDTO> getBlogViewNum() {
        return blogMapper.getBlogViewNum();
    }
}
