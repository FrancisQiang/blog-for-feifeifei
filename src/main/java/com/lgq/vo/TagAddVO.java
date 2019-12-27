package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagAddVO {

    private String tagName;

    private String tagAlias;

    private String tagColor;

    private String tagDescription;

}
