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
public class SiteFriendLinkAddVO {

    private String friendLinkName;

    private String friendLinkIconValue;

    private String friendLinkIconColor;

    private String friendLinkUrl;

    private String friendLinkDescription;
}
