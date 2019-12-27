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
public class AlbumPictureAddVO {

    private String albumPictureUrl;

    private Integer albumPictureCategory;

    private String albumPictureName;

    private String albumPictureDescription;

}
