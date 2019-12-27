package com.lgq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogCategoryNumDTO {

    private String categoryName;

    private Integer num;

}
