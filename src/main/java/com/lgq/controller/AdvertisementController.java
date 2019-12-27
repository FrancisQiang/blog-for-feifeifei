package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Advertisement;
import com.lgq.exception.BlogException;
import com.lgq.service.AdvertisementService;
import com.lgq.vo.AdvertisementAddVO;
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
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @Autowired
    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.POST)
    public String addAdvertisement(@RequestBody AdvertisementAddVO advertisementAddVO) throws BlogException {
        log.info("FrancisBlog: addAdvertisement -> {}", JSON.toJSONString(advertisementAddVO));
        return advertisementService.addAdvertisement(advertisementAddVO);
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.GET)
    public List<Advertisement> getAllAdvertisement() {
        log.info("FrancisBlog: getAllAdvertisement");
        return advertisementService.getAll();
    }

    @RequestMapping(value = "/advertisement/{advertisement_id}", method = RequestMethod.DELETE)
    public String deleteAdvertisement(@PathVariable(value = "advertisement_id")Integer advertisementId) throws BlogException {
        log.info("FrancisBlog: deleteAdvertisement:" + advertisementId);
        return advertisementService.deleteAdvertisementById(advertisementId);
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.PUT)
    public String updateAdvertisement(@RequestBody Advertisement advertisement) throws BlogException {
        log.info("FrancisBlog: updateAdvertisement -> {}", JSON.toJSONString(advertisement));
        return advertisementService.updateAdvertisementById(advertisement);
    }

}
