package com.lgq.service;

import com.lgq.domain.SiteFriendLink;
import com.lgq.exception.BlogException;
import com.lgq.vo.SiteFriendLinkAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface SiteFriendLinkService {

    /**
     * 添加网站友链
     * @param siteFriendLinkAddVO 网站友链信息
     * @return 添加结果
     * @throws BlogException 异常
     */
    String addSiteFriendLink(SiteFriendLinkAddVO siteFriendLinkAddVO) throws BlogException;

    /**
     * 获取所有友链
     * @return 友链列表
     */
    List<SiteFriendLink> getAll();

    /**
     * 删除指定友链
     * @param siteFriendLinkId 友链id
     * @throws BlogException 异常
     * @return 删除结果
     */
    String deleteSiteFriendLinkById(Integer siteFriendLinkId) throws BlogException;

    /**
     * 更新网站友链
     * @param siteFriendLink 更新的友链信息
     * @throws BlogException 异常
     * @return 更新结果
     */
    String updateSiteFriendLinkById(SiteFriendLink siteFriendLink) throws BlogException;
}
