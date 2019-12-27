package com.lgq.service.impl;

import com.lgq.dao.AdvertisementMapper;
import com.lgq.domain.Advertisement;
import com.lgq.exception.BlogException;
import com.lgq.service.AdvertisementService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.AdvertisementAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementMapper advertisementMapper;

    @Autowired
    @SuppressWarnings("all")
    public AdvertisementServiceImpl(AdvertisementMapper advertisementMapper) {
        this.advertisementMapper = advertisementMapper;
    }

    @Override
    public String addAdvertisement(AdvertisementAddVO advertisementAddVO) throws BlogException {
        Advertisement advertisement = new Advertisement();
        BeanUtils.copyProperties(advertisementAddVO, advertisement);
        int row = advertisementMapper.insertSelective(advertisement);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<Advertisement> getAll() {
        return advertisementMapper.selectByExample(null);
    }

    @Override
    public String deleteAdvertisementById(Integer advertisementId) throws BlogException {
        int row = advertisementMapper.deleteByPrimaryKey(advertisementId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateAdvertisementById(Advertisement advertisement) throws BlogException {
        int row = advertisementMapper.updateByPrimaryKey(advertisement);
        return CodeMessageUtil.updateMessage(row);
    }
}
