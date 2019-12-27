package com.lgq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/27
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class AlbumPictureGetDTO {

    private Integer albumPictureId;

    private String albumPictureUrl;

    private Integer albumPictureCategory;

    private String albumPictureName;

    private String albumPictureDescription;

    private String albumName;

}
