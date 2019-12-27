package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.SiteTag;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteTagService;
import com.lgq.vo.SiteTagAddVO;
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
public class SiteTagController {

    private SiteTagService siteTagService;

    @Autowired
    public SiteTagController(SiteTagService siteTagService) {
        this.siteTagService = siteTagService;
    }

    @RequestMapping(value = "/site_tag", method = RequestMethod.POST)
    public String addSiteTag(@RequestBody SiteTagAddVO siteTag) throws BlogException {
        log.info("FrancisBlog: addSiteTag -> {}", JSON.toJSONString(siteTag));
        return siteTagService.addSiteTag(siteTag);
    }

    @RequestMapping(value = "/site_tag", method = RequestMethod.GET)
    public List<SiteTag> getAllSiteTag() {
        log.info("FrancisBlog: getAllSiteTag");
        return siteTagService.getAll();
    }

    @RequestMapping(value = "/site_tag/{site_tag_id}", method = RequestMethod.DELETE)
    public String deleteSiteTag(@PathVariable(value = "site_tag_id")Integer siteTagId) throws BlogException{
        log.info("FrancisBlog: deleteSiteTag:" + siteTagId);
        return siteTagService.deleteSiteTagById(siteTagId);
    }

    @RequestMapping(value = "/site_tag", method = RequestMethod.PUT)
    public String updateSiteTag(@RequestBody SiteTag siteTag) throws BlogException{
        log.info("FrancisBlog: updateSiteTag -> {}", JSON.toJSONString(siteTag));
        return siteTagService.updateSiteTag(siteTag);
    }

}
