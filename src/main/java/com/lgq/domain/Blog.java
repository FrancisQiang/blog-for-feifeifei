package com.lgq.domain;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private Date blogCreateTime;

    private Date blogUpdateTime;

    private String blogTitle;

    private Integer blogViews;

    private Integer blogReply;

    private Boolean blogRecommend;

    private Boolean blogDeleteFlag;

    private Integer blogCategoryId;

    private String blogCover;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Date getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(Date blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public Date getBlogUpdateTime() {
        return blogUpdateTime;
    }

    public void setBlogUpdateTime(Date blogUpdateTime) {
        this.blogUpdateTime = blogUpdateTime;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Integer getBlogViews() {
        return blogViews;
    }

    public void setBlogViews(Integer blogViews) {
        this.blogViews = blogViews;
    }

    public Integer getBlogReply() {
        return blogReply;
    }

    public void setBlogReply(Integer blogReply) {
        this.blogReply = blogReply;
    }

    public Boolean getBlogRecommend() {
        return blogRecommend;
    }

    public void setBlogRecommend(Boolean blogRecommend) {
        this.blogRecommend = blogRecommend;
    }

    public Boolean getBlogDeleteFlag() {
        return blogDeleteFlag;
    }

    public void setBlogDeleteFlag(Boolean blogDeleteFlag) {
        this.blogDeleteFlag = blogDeleteFlag;
    }

    public Integer getBlogCategoryId() {
        return blogCategoryId;
    }

    public void setBlogCategoryId(Integer blogCategoryId) {
        this.blogCategoryId = blogCategoryId;
    }

    public String getBlogCover() {
        return blogCover;
    }

    public void setBlogCover(String blogCover) {
        this.blogCover = blogCover == null ? null : blogCover.trim();
    }
}