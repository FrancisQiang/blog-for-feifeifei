package com.lgq.service;

import com.lgq.domain.Album;
import com.lgq.exception.BlogException;
import com.lgq.vo.AlbumAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface AlbumService {

    /**
     * 添加相册
     * @param albumAddVO 新增相册对象
     * @return 新增结果
     * @throws BlogException 异常
     */
    String addAlbum(AlbumAddVO albumAddVO) throws BlogException;

    /**
     * 获取所有相册
     * @return 相册列表
     */
    List<Album> getAll();

    /**
     * 删除指定相册
     * @param albumId 相册id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteAlbumById(Integer albumId)throws BlogException;

    /**
     * 更新指定相册
     * @param album 更新相册信息
     * @throws BlogException 异常
     * @return 更新结果
     */
    String updateAlbumById(Album album) throws BlogException;
}
