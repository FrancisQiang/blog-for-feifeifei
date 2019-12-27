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
public class SiteIconAddVO {

    private String siteIconName;

    private String siteIconColor;

    private String siteIconUrl;

    private String siteIconValue;

    private String siteIconDescription;

}
