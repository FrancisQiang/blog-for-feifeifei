package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.SiteFriendLink;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteFriendLinkService;
import com.lgq.vo.SiteFriendLinkAddVO;
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
public class SiteFriendLinkController {

    private final SiteFriendLinkService siteFriendLinkService;

    @Autowired
    public SiteFriendLinkController(SiteFriendLinkService siteFriendLinkService) {
        this.siteFriendLinkService = siteFriendLinkService;
    }

    @RequestMapping(value = "/site_friend_link", method = RequestMethod.POST)
    public String addSiteFriendLink(@RequestBody SiteFriendLinkAddVO siteFriendLinkAddVO) throws BlogException {
        log.info("FrancisBlog: addSiteFriendLink -> {}", JSON.toJSONString(siteFriendLinkAddVO));
        return siteFriendLinkService.addSiteFriendLink(siteFriendLinkAddVO);
    }

    @RequestMapping(value = "/site_friend_link", method = RequestMethod.GET)
    public List<SiteFriendLink> getAllSiteFriendLink() {
        log.info("FrancisBlog: getAllSiteFriendLink");
        return siteFriendLinkService.getAll();
    }

    @RequestMapping(value = "/site_friend_link/{site_friend_link_id}", method = RequestMethod.DELETE)
    public String deleteSiteFriendLink(@PathVariable(value = "site_friend_link_id") Integer siteFriendLinkId) throws BlogException{
        log.info("FrancisBlog: deleteSiteFriendLink:" + siteFriendLinkId);
        return siteFriendLinkService.deleteSiteFriendLinkById(siteFriendLinkId);
    }

    @RequestMapping(value = "/site_friend_link", method = RequestMethod.PUT)
    public String updateSiteFriendLink(@RequestBody SiteFriendLink siteFriendLink) throws BlogException {
        log.info("FrancisBlog: updateSiteFriendLink -> {}", JSON.toJSONString(siteFriendLink));
        return siteFriendLinkService.updateSiteFriendLinkById(siteFriendLink);

    }

}
