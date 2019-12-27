package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.AlbumPicture;
import com.lgq.exception.BlogException;
import com.lgq.service.AlbumPictureService;
import com.lgq.service.AlbumService;
import com.lgq.vo.AlbumPictureAddVO;
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
public class AlbumPictureController {

    private final AlbumPictureService albumPictureService;

    @Autowired
    public AlbumPictureController(AlbumPictureService albumPictureService) {
        this.albumPictureService = albumPictureService;
    }

    @RequestMapping(value = "/album_picture", method = RequestMethod.POST)
    public String addAlbumPicture(@RequestBody AlbumPictureAddVO albumPictureAddVO) throws BlogException {
        log.info("FrancisBlog: addAlbumPicture -> {}", JSON.toJSONString(albumPictureAddVO));
        return albumPictureService.addAlbumPicture(albumPictureAddVO);
    }

    @RequestMapping(value = "/album_picture", method = RequestMethod.GET)
    public List<AlbumPicture> getAllAlbum() throws BlogException {
        log.info("FrancisBlog: getAllAlbum");
        return albumPictureService.getAll();
    }

    @RequestMapping(value = "/album_picture/{album_picture_id}", method = RequestMethod.DELETE)
    public String deleteAlbumPicture(@PathVariable(value = "album_picture_id")Integer albumPictureId) throws BlogException{
        log.info("FrancisBlog: deleteAlbumPicture:" + albumPictureId);
        return albumPictureService.deleteAlbumPictureById(albumPictureId);
    }

    @RequestMapping(value = "/album_picture", method = RequestMethod.PUT)
    public String updateAlbumPicture(@RequestBody AlbumPicture albumPicture) throws BlogException{
        log.info("FrancisBlog: updateAlbumPicture -> {}", JSON.toJSONString(albumPicture));
        return albumPictureService.updateAlbumPictureById(albumPicture);
    }

}
