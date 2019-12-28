package com.lgq.service;

import com.lgq.domain.Category;
import com.lgq.exception.BlogException;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface CategoryService {
    /**
     * 添加文章分类
     * @param category 分类
     * @throws BlogException 异常
     * @return 添加结果
     */
    String addCategory(Category category) throws BlogException;

    /**
     * 获取所有文章分类
     * @return 文章分类列表
     */
    List<Category> getAll();

    /**
     * 删除指定分类
     * @param id 分类id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteCategoryById(Integer id) throws BlogException;

    /**
     * 更新分类信息
     * @param category 分类
     * @throws BlogException 异常
     * @return 更新结果
     */
    String updateCategoryById(Category category) throws BlogException;
}
