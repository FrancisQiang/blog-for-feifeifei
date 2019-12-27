package com.lgq.service;

import com.lgq.domain.BlogComment;
import com.lgq.dto.PageInfoDTO;
import com.lgq.exception.BlogException;
import com.lgq.vo.BlogCommentAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface BlogCommentService {
    /**
     * 添加评论
     * @param blogCommentAddVO 评论
     * @return 添加结果
     * @throws BlogException 博客异常
     */
    String addBlogComment(BlogCommentAddVO blogCommentAddVO) throws BlogException;

    /**
     * 获取所有评论列表
     * @return 评论列表
     */
    List<BlogComment> getAllBlogComment();

    /**
     * 删除评论
     * @param blogCommentId 博客评论id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteBlogCommentById(Integer blogCommentId) throws BlogException;
}
