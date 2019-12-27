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
public class AlbumAddVO {

    private String albumName;

    private String albumDescription;

    private String ablumCover;

}
