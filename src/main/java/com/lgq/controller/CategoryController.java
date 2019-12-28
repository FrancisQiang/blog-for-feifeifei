package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Category;
import com.lgq.exception.BlogException;
import com.lgq.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author lgq
 * @date 2019/12/28
 */
@RestController
@Slf4j
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String addCategory(@RequestBody Category category) throws BlogException {
        log.info("FrancisBlog: addCategory -> {}", JSON.toJSONString(category));
        return categoryService.addCategory(category);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<Category> getAllCategory() {
        log.info("FrancisBlog: getAllCategory");
        return categoryService.getAll();
    }

    @RequestMapping(value = "/category/{category_id}", method = RequestMethod.DELETE)
    public String deleteCategory(@PathVariable(value = "category_id")Integer id) throws BlogException {
        log.info("FrancisBlog: deleteCategory:" + id);
        return categoryService.deleteCategoryById(id);
    }

    @RequestMapping(value = "/category", method = RequestMethod.PUT)
    public String updateCategory(@RequestBody Category category) throws BlogException{
        log.info("FrancisBlog: addCategory -> {}", JSON.toJSONString(category));
        return categoryService.updateCategoryById(category);
    }

}
