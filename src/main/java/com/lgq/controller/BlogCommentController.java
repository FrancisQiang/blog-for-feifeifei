package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.BlogComment;
import com.lgq.exception.BlogException;
import com.lgq.service.BlogCommentService;
import com.lgq.vo.BlogCommentAddVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/26
 */
@RestController
@Slf4j
@CrossOrigin
public class BlogCommentController {

    private final BlogCommentService blogCommentService;

    @Autowired
    public BlogCommentController(BlogCommentService blogCommentService) {
        this.blogCommentService = blogCommentService;
    }

    @RequestMapping(value = "/blog_comment", method = RequestMethod.POST)
    public String addBlogComment(@RequestBody BlogCommentAddVO blogCommentAddVO) throws BlogException {
        log.info("FrancisBlog: addBlog -> {}", JSON.toJSONString(blogCommentAddVO));
        return blogCommentService.addBlogComment(blogCommentAddVO);
    }

    @RequestMapping(value = "/blog_comment", method = RequestMethod.GET)
    public List<BlogComment> getAllBlogComment() {
        log.info("FrancisBlog: getAllBlogComment");
        return blogCommentService.getAllBlogComment();
    }

    @RequestMapping(value = "/blog_comment/{blog_comment_id}", method = RequestMethod.DELETE)
    public String deleteBlogComment(@PathVariable(value = "blog_comment_id")Integer blogCommentId) throws BlogException{
        log.info("FrancisBlog: deleteBlogComment" + blogCommentId);
        return blogCommentService.deleteBlogCommentById(blogCommentId);
    }

}
