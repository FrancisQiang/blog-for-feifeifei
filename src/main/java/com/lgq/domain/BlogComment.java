package com.lgq.domain;

import java.util.Date;

public class BlogComment {
    private Integer blogCommentId;

    private String blogCommentUsername;

    private Integer blogCommentBlogId;

    private Date blogCommentDate;

    private Integer blogCommentParentId;

    private Boolean blogCommentDeleteFlag;

    private String blogCommentContent;

    public Integer getBlogCommentId() {
        return blogCommentId;
    }

    public void setBlogCommentId(Integer blogCommentId) {
        this.blogCommentId = blogCommentId;
    }

    public String getBlogCommentUsername() {
        return blogCommentUsername;
    }

    public void setBlogCommentUsername(String blogCommentUsername) {
        this.blogCommentUsername = blogCommentUsername == null ? null : blogCommentUsername.trim();
    }

    public Integer getBlogCommentBlogId() {
        return blogCommentBlogId;
    }

    public void setBlogCommentBlogId(Integer blogCommentBlogId) {
        this.blogCommentBlogId = blogCommentBlogId;
    }

    public Date getBlogCommentDate() {
        return blogCommentDate;
    }

    public void setBlogCommentDate(Date blogCommentDate) {
        this.blogCommentDate = blogCommentDate;
    }

    public Integer getBlogCommentParentId() {
        return blogCommentParentId;
    }

    public void setBlogCommentParentId(Integer blogCommentParentId) {
        this.blogCommentParentId = blogCommentParentId;
    }

    public Boolean getBlogCommentDeleteFlag() {
        return blogCommentDeleteFlag;
    }

    public void setBlogCommentDeleteFlag(Boolean blogCommentDeleteFlag) {
        this.blogCommentDeleteFlag = blogCommentDeleteFlag;
    }

    public String getBlogCommentContent() {
        return blogCommentContent;
    }

    public void setBlogCommentContent(String blogCommentContent) {
        this.blogCommentContent = blogCommentContent == null ? null : blogCommentContent.trim();
    }
}