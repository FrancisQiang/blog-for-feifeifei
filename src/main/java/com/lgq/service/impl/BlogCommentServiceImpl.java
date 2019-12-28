package com.lgq.service.impl;

import com.lgq.dao.BlogCommentMapper;
import com.lgq.domain.BlogComment;
import com.lgq.domain.BlogCommentExample;
import com.lgq.exception.BlogException;
import com.lgq.service.BlogCommentService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.BlogCommentAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class BlogCommentServiceImpl implements BlogCommentService {

    private final BlogCommentMapper blogCommentMapper;

    @Autowired
    @SuppressWarnings("all")
    public BlogCommentServiceImpl(BlogCommentMapper blogCommentMapper) {
        this.blogCommentMapper = blogCommentMapper;
    }

    @Override
    public String addBlogComment(BlogCommentAddVO blogCommentAddVO) throws BlogException {
        BlogComment blogComment = new BlogComment();
        BeanUtils.copyProperties(blogCommentAddVO, blogComment);
        int row = blogCommentMapper.insertSelective(blogComment);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<BlogComment> getAllBlogComment() {
        BlogCommentExample commentExample = new BlogCommentExample();
        BlogCommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andBlogCommentDeleteFlagEqualTo(false);
        return blogCommentMapper.selectByExampleWithBLOBs(commentExample);
    }

    @Override
    public String deleteBlogCommentById(Integer blogCommentId) throws BlogException {
        BlogComment blogComment = new BlogComment();
        blogComment.setBlogCommentId(blogCommentId);
        blogComment.setBlogCommentDeleteFlag(true);
        int row = blogCommentMapper.updateByPrimaryKeyWithBLOBs(blogComment);
        return CodeMessageUtil.updateMessage(row);
    }
}
