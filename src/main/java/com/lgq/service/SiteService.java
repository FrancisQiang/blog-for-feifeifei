package com.lgq.service;

import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.vo.SiteAndPageViewVO;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface SiteService {

    /**
     * 获取网站信息
     * @return 网站基本信息
     */
    SiteAndPageViewVO getSiteInfo();

    /**
     * 更新网站信息
     * @param site 更新信息
     * @throws BlogException 异常
     * @return 是否成功
     */
    String updateSiteInfo(Site site) throws BlogException;
}
