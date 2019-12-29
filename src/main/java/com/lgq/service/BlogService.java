package com.lgq.service;

import com.lgq.domain.BlogWithBLOBs;
import com.lgq.dto.*;
import com.lgq.exception.BlogException;
import com.lgq.vo.BlogAddVO;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface BlogService {

    /**
     * 添加博客
     * @return 添加结果
     * @param blogAddVO 博客信息
     * @throws BlogException 异常
     */
    String addBlog(BlogAddVO blogAddVO) throws BlogException;

    /**
     * 获取博客列表
     * @param pageIndex 页数
     * @return 博客列表
     */
    PageInfoDTO<BlogGetDTO> getBlogList(Integer pageIndex);

    /**
     * 获取指定分类下的所有博客
     * @param categoryId 分类id
     * @return 博客列表
     */
    List<BlogGetByCategoryDTO> getBlogListByCategory(Integer categoryId);

    /**
     * 删除指定博客
     * @param blogId 博客id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteBlogById(Integer blogId) throws BlogException;

    /**
     * 获取指定博客内容
     * @param blogId 博客id
     * @return 博客主要信息
     */
    BlogContentGetDTO getBlogById(Integer blogId);

    /**
     * 修改指定博客
     * @param blog 修改的博客信息
     * @return 更新结果
     * @throws BlogException 异常
     */
    String updateBlogById(BlogWithBLOBs blog)throws BlogException;

    /**
     * 获取所有分类的相应博客数量
     * @return 返回博客数量
     */
    List<BlogCategoryNumDTO> getBlogCategoryNum();

    /**
     * 获取每月的文章数量
     * @return 每月文章数量
     */
    List<Integer> getMonthNum();

    /**
     * 获取博客访问数量
     * @return 博客访问数量排行榜
     */
    List<BlogViewNumDTO> getBlogViewNum();
}
