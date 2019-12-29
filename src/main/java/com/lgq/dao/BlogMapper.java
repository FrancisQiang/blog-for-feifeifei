package com.lgq.dao;

import com.lgq.domain.Blog;
import com.lgq.domain.BlogExample;
import com.lgq.domain.BlogWithBLOBs;

import java.util.Date;
import java.util.List;

import com.lgq.dto.*;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(BlogWithBLOBs record);

    int insertSelective(BlogWithBLOBs record);

    List<BlogWithBLOBs> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    BlogWithBLOBs selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") BlogWithBLOBs record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogWithBLOBs record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(BlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogWithBLOBs record);

    int updateByPrimaryKey(Blog record);

    List<BlogPreGetDTO> getBlogList();

    BlogContentPreGetDTO getBlogContentById(Integer id);

    List<BlogGetByCategoryDTO> getBlogListByCategory(Integer id);

    List<BlogCategoryNumDTO> getBlogCategoryNum();

    List<Date> selectCreateTimeList();

    Long getBlogCount();

    List<BlogViewNumDTO> getBlogViewNum();
}