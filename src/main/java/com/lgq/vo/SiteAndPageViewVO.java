package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lgq
 * @date 2019/12/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SiteAndPageViewVO {

    private Integer siteId;

    private String siteTitile;

    private String siteSubtitle;

    private String siteDescription;

    private String siteLogo;

    private String siteAvatar;

    private Long totalPageView;

    private Long todayPageView;

}
