package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.SiteIcon;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteIconService;
import com.lgq.vo.SiteIconAddVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/25
 */
@RestController
@Slf4j
@CrossOrigin
public class SiteIconController {

    private final SiteIconService siteIconService;

    @Autowired
    public SiteIconController(SiteIconService siteIconService) {
        this.siteIconService = siteIconService;
    }

    @RequestMapping(value = "/site_icon", method = RequestMethod.POST)
    public String addSiteIcon(@RequestBody SiteIconAddVO siteIcon) throws BlogException {
        log.info("FrancisBlog: addSiteIcon -> {}", JSON.toJSONString(siteIcon));
        return siteIconService.addSiteIcon(siteIcon);
    }

    @RequestMapping(value = "/site_icon", method = RequestMethod.GET)
    public List<SiteIcon> getAllSiteIcon() {
        log.info("FrancisBlog: getAllSiteIcon");
        return siteIconService.getAll();
    }

    @RequestMapping(value = "/site_icon/{site_icon_id}", method = RequestMethod.DELETE)
    public String deleteSiteIcon(@PathVariable(value = "site_icon_id")Integer siteIconId) throws BlogException {
        log.info("FrancisBlog: deleteSiteIcon:" + siteIconId);
        return siteIconService.deleteSiteIconById(siteIconId);
    }

    @RequestMapping(value = "/site_icon", method = RequestMethod.PUT)
    public String updateSiteIcon(@RequestBody SiteIcon siteIcon) throws BlogException{
        log.info("FrancisBlog: addSiteIcon -> {}", JSON.toJSONString(siteIcon));
        return siteIconService.updateSiteIconById(siteIcon);
    }

}
