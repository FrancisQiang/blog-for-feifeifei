package com.lgq.service;

import com.lgq.domain.Advertisement;
import com.lgq.domain.Blog;
import com.lgq.exception.BlogException;
import com.lgq.vo.AdvertisementAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface AdvertisementService {

    /**
     * 添加广告
     * @param advertisementAddVO 广告信息
     * @throws BlogException 异常
     * @return 添加结果
     */
    String addAdvertisement(AdvertisementAddVO advertisementAddVO) throws BlogException;

    /**
     * 获取所有广告
     * @return 广告列表
     */
    List<Advertisement> getAll();

    /**
     * 删除指定广告
     * @param advertisementId 广告id
     * @throws BlogException 异常
     * @return 删除结果
     */
    String deleteAdvertisementById(Integer advertisementId) throws BlogException;

    /**
     * 更新广告信息
     * @param advertisement 更新广告信息
     * @throws BlogException 异常
     * @return 更新结果
     */
    String updateAdvertisementById(Advertisement advertisement)throws BlogException;
}
