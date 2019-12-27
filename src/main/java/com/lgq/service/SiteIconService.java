package com.lgq.service;

import com.lgq.domain.SiteIcon;
import com.lgq.exception.BlogException;
import com.lgq.vo.SiteIconAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface SiteIconService {

    /**
     * 添加网站图不爱
     * @param siteIcon 网站图标
     * @return 添加信息
     * @throws BlogException 异常
     */
    String addSiteIcon(SiteIconAddVO siteIcon) throws BlogException;

    /**
     * 获取所有网站图标
     * @return 网站图标列表
     */
    List<SiteIcon> getAll();

    /**
     * 删除指定网站图标
     * @param siteIconId 网站图标id
     * @return 删除信息
     * @throws BlogException 异常
     */
    String deleteSiteIconById(int siteIconId) throws BlogException;

    /**
     * 更新指定网站图标
     * @param siteIcon 网站图标信息
     * @throws BlogException 异常
     * @return 更新信息
     */
    String updateSiteIconById(SiteIcon siteIcon) throws BlogException;
}
