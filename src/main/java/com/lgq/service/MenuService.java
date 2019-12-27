package com.lgq.service;

import com.lgq.domain.Menu;
import com.lgq.dto.MenuListDTO;
import com.lgq.exception.BlogException;
import com.lgq.vo.MenuAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface MenuService {
    /**
     * 添加菜单
     * @param menuAddVO 添加菜单信息
     * @return 菜单
     * @throws BlogException 异常
     */
    String addMenu(MenuAddVO menuAddVO) throws BlogException;

    /**
     * 获取所有菜单
     * @return 所有菜单列表
     */
    List<MenuListDTO> getAll();

    /**
     * 删除指定菜单
     * @param menuId id
     * @throws BlogException 异常
     * @return 删除结果
     */
    String deleteMenuById(Integer menuId) throws BlogException;

    /**
     * 更新指定菜单
     * @param menu 菜单
     * @return 更新结果
     * @throws BlogException 异常
     */
    String updateMenuById(Menu menu) throws BlogException;

    /**
     * 获取所有父类菜单
     * @return 父类菜单列表
     */
    List<Menu> getAllParentMenu();
}
