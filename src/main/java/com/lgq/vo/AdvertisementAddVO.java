package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementAddVO {

    private String advertisementPicture;

    private String advertisementUrl;

    private String advertisementName;

    private String advertisementDescription;
}
