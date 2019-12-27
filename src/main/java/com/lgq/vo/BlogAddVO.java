package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogAddVO {

    private Integer blogCreateTime;

    private String blogTitle;

    private Integer blogCategoryId;

    private String blogContent;

}
