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
public class SiteTagAddVO {

    private String siteTagName;

    private String siteTagColor;

    private String siteTagDescription;

}
