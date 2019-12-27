package com.lgq.dao;

import com.lgq.domain.SiteIcon;
import com.lgq.domain.SiteIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteIconMapper {
    long countByExample(SiteIconExample example);

    int deleteByExample(SiteIconExample example);

    int deleteByPrimaryKey(Integer siteIconId);

    int insert(SiteIcon record);

    int insertSelective(SiteIcon record);

    List<SiteIcon> selectByExample(SiteIconExample example);

    SiteIcon selectByPrimaryKey(Integer siteIconId);

    int updateByExampleSelective(@Param("record") SiteIcon record, @Param("example") SiteIconExample example);

    int updateByExample(@Param("record") SiteIcon record, @Param("example") SiteIconExample example);

    int updateByPrimaryKeySelective(SiteIcon record);

    int updateByPrimaryKey(SiteIcon record);
}