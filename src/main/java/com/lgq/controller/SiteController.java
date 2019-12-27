package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Site getSiteInfo() throws BlogException {
        log.info("FrancisBlog: getSiteInfo");
        return siteService.getSiteInfo();
    }

    @RequestMapping(value = "/site", method = RequestMethod.PUT)
    public String updateSiteInfo(@RequestBody Site site) throws BlogException {
        log.info("FrancisBlog: updateSiteInfo -> {}", JSON.toJSONString(site));
        return siteService.updateSiteInfo(site);
    }


}
