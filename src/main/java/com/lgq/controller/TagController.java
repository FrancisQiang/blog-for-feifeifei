package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Tag;
import com.lgq.exception.BlogException;
import com.lgq.service.TagService;
import com.lgq.vo.TagAddVO;
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
public class TagController {

    private final TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @RequestMapping(value = "/tag", method = RequestMethod.POST)
    public String addTag(@RequestBody TagAddVO tagAddVO) throws BlogException {
        log.info("FrancisBlog: addTag -> {}", JSON.toJSONString(tagAddVO));
        return tagService.addTag(tagAddVO);
    }

    @RequestMapping(value = "/tag", method = RequestMethod.GET)
    public List<Tag> getAllTag() {
        log.info("FrancisBlog: getAllTag");
        return tagService.getAll();
    }

    @RequestMapping(value = "/tag/{tag_id}", method = RequestMethod.DELETE)
    public String deleteTag(@PathVariable(value = "tag_id")Integer tagId) throws BlogException{
        log.info("FrancisBlog: deleteTag:" + tagId);
        return tagService.deleteTagById(tagId);
    }

    @RequestMapping(value = "/tag", method = RequestMethod.PUT)
    public String updateTag(@RequestBody Tag tag) throws BlogException{
        log.info("FrancisBlog: updateTag -> {}", JSON.toJSONString(tag));
        return tagService.updateTagById(tag);
    }

}
