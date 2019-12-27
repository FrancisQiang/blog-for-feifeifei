package com.lgq.service;

import com.lgq.domain.SiteTag;
import com.lgq.exception.BlogException;
import com.lgq.vo.SiteTagAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface SiteTagService {

    /**
     * 添加网页标签
     * @param siteTag 网页标签信息
     * @throws  BlogException  异常
     * @return 返回添加信息
     */
    String addSiteTag(SiteTagAddVO siteTag) throws BlogException;


    /**
     * 获取所有网站标签
     * @return 所有网站标签
     */
    List<SiteTag> getAll();

    /**
     * 删除网站标签
     * @param siteTagId id
     * @throws BlogException 异常
     * @return 删除信息
     */
    String deleteSiteTagById(int siteTagId) throws BlogException;

    /**
     * 更新网站标签
     * @param siteTag 网站标签
     * @throws BlogException 异常
     * @return 更新信息
     */
    String updateSiteTag(SiteTag siteTag) throws BlogException;
}
