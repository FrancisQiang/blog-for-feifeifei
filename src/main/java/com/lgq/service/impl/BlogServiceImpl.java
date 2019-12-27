package com.lgq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lgq.dao.BlogMapper;
import com.lgq.dao.BlogTagMapper;
import com.lgq.dao.TagMapper;
import com.lgq.domain.Blog;
import com.lgq.domain.BlogTag;
import com.lgq.domain.BlogWithBLOBs;
import com.lgq.domain.Tag;
import com.lgq.dto.*;
import com.lgq.exception.BlogException;
import com.lgq.service.BlogService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.BlogAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class BlogServiceImpl implements BlogService {

    private final BlogMapper blogMapper;
    private final TagMapper tagMapper;
    private final BlogTagMapper blogTagMapper;

    @Autowired
    @SuppressWarnings("all")
    public BlogServiceImpl(BlogMapper blogMapper, TagMapper tagMapper, BlogTagMapper blogTagMapper) {
        this.blogMapper = blogMapper;
        this.tagMapper = tagMapper;
        this.blogTagMapper = blogTagMapper;
    }

    @Override
    public String addBlog(BlogAddVO blogAddVO) throws BlogException {
        BlogWithBLOBs blogWithBLOBs = new BlogWithBLOBs();
        blogWithBLOBs.setBlogUpdateTime(new Date(blogAddVO.getBlogCreateTime()));
        blogWithBLOBs.setBlogSummary(blogAddVO.getBlogContent().substring(0, 150));
        blogWithBLOBs.setBlogCreateTime(new Date(blogAddVO.getBlogCreateTime()));
        blogWithBLOBs.setBlogTitle(blogAddVO.getBlogTitle());
        blogWithBLOBs.setBlogContent(blogAddVO.getBlogContent());
        blogWithBLOBs.setBlogCategoryId(blogAddVO.getBlogCategoryId());
        int row = blogMapper.insertSelective(blogWithBLOBs);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public PageInfoDTO<BlogGetDTO> getBlogList(Integer pageIndex) {
        PageHelper.startPage(pageIndex, 10);
        List<BlogPreGetDTO> blogList = blogMapper.getBlogList();
        List<BlogTag> blogTags = blogTagMapper.selectByExample(null);
        List<Tag> tags = tagMapper.selectByExample(null);
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
        pageInfoDTO.setCurrentPage(pageInfo.getPageNum());
        pageInfoDTO.setSize(pageInfo.getSize());
        pageInfoDTO.setTotal(pageInfo.getTotal());
        pageInfoDTO.setTotalPage(pageInfo.getPages());
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
    public BlogContentGetDTO getBlogById(Integer blogId) {
        BlogContentPreGetDTO blogContentPreGetDTO = blogMapper.getBlogContentById(blogId);
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
    public String updateBlogById(BlogWithBLOBs blog) throws BlogException {
        int row = blogMapper.updateByPrimaryKeyWithBLOBs(blog);
        return CodeMessageUtil.updateMessage(row);
    }
}
