package com.lgq.service.impl;

import com.lgq.dao.MenuMapper;
import com.lgq.domain.Menu;
import com.lgq.domain.MenuExample;
import com.lgq.dto.MenuListDTO;
import com.lgq.exception.BlogException;
import com.lgq.service.MenuService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.MenuAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;

    @Autowired
    @SuppressWarnings("all")
    public MenuServiceImpl(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @Override
    public String addMenu(MenuAddVO menuAddVO) throws BlogException {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuAddVO, menu);
        int row = menuMapper.insertSelective(menu);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<MenuListDTO> getAll() {
        List<Menu> allMenu = menuMapper.selectByExample(null);
        List<MenuListDTO> menuListDTO = new ArrayList<>();
        for (Menu item : allMenu) {
            if (item.getMenuPid() == 0) {
                MenuListDTO mld = new MenuListDTO();
                mld.setChildMenu(new ArrayList<>());
                BeanUtils.copyProperties(item, mld);
                for (Menu subItem : allMenu) {
                    if (subItem.getMenuPid().equals(item.getMenuId())) {
                        mld.getChildMenu().add(subItem);
                    }
                }
                menuListDTO.add(mld);
            }
        }
        return menuListDTO;
    }

    @Override
    public String deleteMenuById(Integer menuId) throws BlogException {
        int row = menuMapper.deleteByPrimaryKey(menuId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateMenuById(Menu menu) throws BlogException {
        int row = menuMapper.updateByPrimaryKeySelective(menu);
        return CodeMessageUtil.updateMessage(row);
    }

    @Override
    public List<Menu> getAllParentMenu() {
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        criteria.andMenuIdEqualTo(0);
        return menuMapper.selectByExample(menuExample);
    }
}
