package com.lgq.service;

import com.lgq.domain.AlbumPicture;
import com.lgq.dto.AlbumPictureGetDTO;
import com.lgq.exception.BlogException;
import com.lgq.vo.AlbumPictureAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface AlbumPictureService {
    /**
     * 添加相册图片
     * @param albumPictureAddVO 相册图片添加信息
     * @return 添加结果
     * @throws BlogException 异常
     */
    String addAlbumPicture(AlbumPictureAddVO albumPictureAddVO) throws BlogException;

    /**
     * 获取所有图片
     * @return 图片列表
     * @throws BlogException 异常
     */
    List<AlbumPictureGetDTO> getAll() throws BlogException;

    /**
     * 删除指定照片
     * @param albumPictureId 照片id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteAlbumPictureById(Integer albumPictureId) throws BlogException;

    /**
     * 更新相册图片
     * @param albumPicture 相册图片更新信息
     * @return 更新结果
     * @throws BlogException 异常
     */
    String updateAlbumPictureById(AlbumPicture albumPicture) throws BlogException;
}
