package com.lgq.service;

import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.vo.SiteAndPageViewVO;

import java.util.List;
import java.util.Map;

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

    /**
     * 获取近七天的访问量
     * @return 近七天的访问量
     */
    Map<String, List<Object>> getSiteViewTrend();

}
