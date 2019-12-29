package com.lgq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lgq
 * @date 2019/12/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogViewNumDTO {

    private String blogTitle;

    private Integer blogViews;

    private Date blogUpdateTime;

}
