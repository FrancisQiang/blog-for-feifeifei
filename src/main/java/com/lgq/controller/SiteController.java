package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import com.lgq.vo.SiteAndPageViewVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Slf4j
@RestController
@CrossOrigin
public class SiteController {

    private final SiteService siteService;

    @Autowired
    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @RequestMapping(value = "/site", method = RequestMethod.GET)
    public SiteAndPageViewVO getSiteInfo() throws BlogException {
        log.info("FrancisBlog: getSiteInfo");
        return siteService.getSiteInfo();
    }

    @RequestMapping(value = "/site", method = RequestMethod.PUT)
    public String updateSiteInfo(@RequestBody Site site) throws BlogException {
        log.info("FrancisBlog: updateSiteInfo -> {}", JSON.toJSONString(site));
        return siteService.updateSiteInfo(site);
    }

    @RequestMapping(value = "/site/view_trend", method = RequestMethod.GET)
    public Map<String, List<Object>> getSiteViewTrend() {
        log.info("FrancisBlog: getSiteViewTrend");
        return siteService.getSiteViewTrend();
    }


}
