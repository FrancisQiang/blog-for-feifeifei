package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Album;
import com.lgq.exception.BlogException;
import com.lgq.service.AlbumService;
import com.lgq.vo.AlbumAddVO;
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
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping(value = "/album", method = RequestMethod.POST)
    public String addAlbum(@RequestBody AlbumAddVO albumAddVO) throws BlogException {
        log.info("FrancisBlog: addAlbum -> {}", JSON.toJSONString(albumAddVO));
        return albumService.addAlbum(albumAddVO);
    }

    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public List<Album> getAllAlbum() {
        log.info("FrancisBlog: getAllAlbum");
        return albumService.getAll();
    }

    @RequestMapping(value = "/album/{album_id}", method = RequestMethod.DELETE)
    public String deleteAlbum(@PathVariable(value = "album_id")Integer albumId) throws BlogException {
        log.info("FrancisBlog: deleteAlbum:" + albumId);
        return albumService.deleteAlbumById(albumId);
    }

    @RequestMapping(value = "/album", method = RequestMethod.PUT)
    public String updateAlbum(@RequestBody Album album) throws BlogException{
        log.info("FrancisBlog: updateAlbum -> {}", JSON.toJSONString(album));
        return albumService.updateAlbumById(album);
    }

}
