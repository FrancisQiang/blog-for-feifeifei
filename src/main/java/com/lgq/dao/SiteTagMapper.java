package com.lgq.dao;

import com.lgq.domain.SiteTag;
import com.lgq.domain.SiteTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteTagMapper {
    long countByExample(SiteTagExample example);

    int deleteByExample(SiteTagExample example);

    int deleteByPrimaryKey(Integer siteTagId);

    int insert(SiteTag record);

    int insertSelective(SiteTag record);

    List<SiteTag> selectByExample(SiteTagExample example);

    SiteTag selectByPrimaryKey(Integer siteTagId);

    int updateByExampleSelective(@Param("record") SiteTag record, @Param("example") SiteTagExample example);

    int updateByExample(@Param("record") SiteTag record, @Param("example") SiteTagExample example);

    int updateByPrimaryKeySelective(SiteTag record);

    int updateByPrimaryKey(SiteTag record);
}