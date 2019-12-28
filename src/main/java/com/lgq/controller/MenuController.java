package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.domain.Menu;
import com.lgq.dto.MenuListDTO;
import com.lgq.exception.BlogException;
import com.lgq.service.MenuService;
import com.lgq.vo.MenuAddVO;
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
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public String addMenu(@RequestBody MenuAddVO menuAddVO) throws BlogException {
        log.info("FrancisBlog: addMenu -> {}", JSON.toJSONString(menuAddVO));
        return menuService.addMenu(menuAddVO);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List<MenuListDTO> getAllMenu() {
        log.info("FrancisBlog: getAllMenu");
        return menuService.getAll();
    }

    @RequestMapping(value = "/menu/{menu_id}", method = RequestMethod.DELETE)
    public String deleteMenu(@PathVariable(value = "menu_id")Integer menuId) throws BlogException{
        log.info("FrancisBlog: deleteMenu:" + menuId);
        return menuService.deleteMenuById(menuId);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.PUT)
    public String updateMenu(@RequestBody Menu menu) throws BlogException{
        log.info("FrancisBlog: updateMenu -> {}", JSON.toJSONString(menu));
        return menuService.updateMenuById(menu);
    }

    @RequestMapping(value = "/parent_menu", method = RequestMethod.GET)
    public List<Menu> getAllParentMenu() {
        log.info("FrancisBlog: getAllParentMenu");
        return menuService.getAllParentMenu();
    }

}
