package com.lgq.dto;

import com.lgq.domain.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuListDTO {

    private Integer menuId;

    private Integer menuPid;

    private String menuName;

    private String menuDescription;

    private List<Menu> childMenu;

}
