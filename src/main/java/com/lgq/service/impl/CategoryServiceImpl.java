package com.lgq.service.impl;

import com.lgq.dao.CategoryMapper;
import com.lgq.domain.Category;
import com.lgq.exception.BlogException;
import com.lgq.service.CategoryService;
import com.lgq.util.CodeMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Autowired
    @SuppressWarnings("all")
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public String addCategory(Category category) throws BlogException {
        int row = categoryMapper.insert(category);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<Category> getAll() {
        return categoryMapper.selectByExample(null);
    }

    @Override
    public String deleteCategoryById(Integer id) throws BlogException {
        int row = categoryMapper.deleteByPrimaryKey(id);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateCategoryById(Category category) throws BlogException {
        int row = categoryMapper.updateByPrimaryKey(category);
        return CodeMessageUtil.updateMessage(row);
    }
}
