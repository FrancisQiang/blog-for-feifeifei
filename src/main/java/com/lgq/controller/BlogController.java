package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Blog;
import com.lgq.domain.BlogWithBLOBs;
import com.lgq.dto.*;
import com.lgq.exception.BlogException;
import com.lgq.service.BlogService;
import com.lgq.vo.BlogAddVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @date 2019/12/25
 */
@RestController
@Slf4j
@CrossOrigin
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController (BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(value = "/blog", method = RequestMethod.POST)
    public String addBlog(@RequestBody BlogAddVO blogAddVO) throws BlogException {
        log.info("FrancisBlog: addBlog -> {}", JSON.toJSONString(blogAddVO));
        return blogService.addBlog(blogAddVO);
    }

    @RequestMapping(value = "/blog/{page_index}", method = RequestMethod.GET)
    public PageInfoDTO<BlogGetDTO> getBlogList(@PathVariable(value = "page_index") Integer pageIndex) {
        log.info("FrancisBlog: getBlogList:" + pageIndex);
        return blogService.getBlogList(pageIndex);
    }

    @RequestMapping(value = "/blog_category/{category_id}", method = RequestMethod.GET)
    public List<BlogGetByCategoryDTO> getBlogListByCategory(@PathVariable(value = "category_id") Integer categoryId) {
        log.info("FrancisBlog: getBlogListByCategory:" +
                " categoryId:" + categoryId);
        return blogService.getBlogListByCategory(categoryId);
    }

    @RequestMapping(value = "/blog/{blog_id}", method = RequestMethod.DELETE)
    public String deleteBlogById(@PathVariable(value = "blog_id") Integer blogId) throws BlogException{
        log.info("FrancisBlog: deleteBlogById:" +
                " blog_id:" + blogId);
        return blogService.deleteBlogById(blogId);
    }

    @RequestMapping(value = "/blog_content/{blog_id}", method = RequestMethod.GET)
    public BlogContentGetDTO getBlogById(@PathVariable(value = "blog_id") Integer blogId) {
        log.info("FrancisBlog: getBlogById:" +
                " blog_id:" + blogId);
        return blogService.getBlogById(blogId);
    }

    @RequestMapping(value = "/blog", method = RequestMethod.PUT)
    public String updateBlogById(@RequestBody BlogWithBLOBs blog) throws BlogException{
        log.info("FrancisBlog: updateBlogById -> {}", JSON.toJSONString(blog));
        return blogService.updateBlogById(blog);
    }

    @RequestMapping(value = "/blog/category_pie", method = RequestMethod.GET)
    public List<BlogCategoryNumDTO> getBlogCategoryNum() {
        log.info("FrancisBlog: getBlogCategoryNum");
        return blogService.getBlogCategoryNum();
    }

    @RequestMapping(value = "/blog/month_num", method = RequestMethod.GET)
    public List<Integer> getMonthNum() {
        log.info("FrancisBlog: getDateNum");
        return blogService.getMonthNum();
    }

    @RequestMapping(value = "/blog_view", method = RequestMethod.GET)
    public List<BlogViewNumDTO> getBlogViewNum() {
        log.info("FrancisBlog: getBlogViewNum");
        return blogService.getBlogViewNum();
    }

}
