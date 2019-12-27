package com.lgq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogGetByCategoryDTO {

    private Integer blogId;
    private String blogTitle;

}
