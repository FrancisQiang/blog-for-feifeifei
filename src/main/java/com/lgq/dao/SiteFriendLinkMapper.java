package com.lgq.dao;

import com.lgq.domain.SiteFriendLink;
import com.lgq.domain.SiteFriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteFriendLinkMapper {
    long countByExample(SiteFriendLinkExample example);

    int deleteByExample(SiteFriendLinkExample example);

    int deleteByPrimaryKey(Integer friendLinkId);

    int insert(SiteFriendLink record);

    int insertSelective(SiteFriendLink record);

    List<SiteFriendLink> selectByExample(SiteFriendLinkExample example);

    SiteFriendLink selectByPrimaryKey(Integer friendLinkId);

    int updateByExampleSelective(@Param("record") SiteFriendLink record, @Param("example") SiteFriendLinkExample example);

    int updateByExample(@Param("record") SiteFriendLink record, @Param("example") SiteFriendLinkExample example);

    int updateByPrimaryKeySelective(SiteFriendLink record);

    int updateByPrimaryKey(SiteFriendLink record);
}