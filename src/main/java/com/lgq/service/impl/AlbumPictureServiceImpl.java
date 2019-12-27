package com.lgq.service.impl;

import com.lgq.dao.AlbumPictureMapper;
import com.lgq.domain.AlbumPicture;
import com.lgq.exception.BlogException;
import com.lgq.service.AlbumPictureService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.AlbumPictureAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class AlbumPictureServiceImpl implements AlbumPictureService {

    private final AlbumPictureMapper albumPictureMapper;

    @Autowired
    @SuppressWarnings("all")
    public AlbumPictureServiceImpl(AlbumPictureMapper albumPictureMapper) {
        this.albumPictureMapper = albumPictureMapper;
    }

    @Override
    public String addAlbumPicture(AlbumPictureAddVO albumPictureAddVO) throws BlogException {
        AlbumPicture albumPicture = new AlbumPicture();
        BeanUtils.copyProperties(albumPictureAddVO, albumPicture);
        int row = albumPictureMapper.insertSelective(albumPicture);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<AlbumPicture> getAll() throws BlogException {
        return albumPictureMapper.selectByExample(null);
    }

    @Override
    public String deleteAlbumPictureById(Integer albumPictureId) throws BlogException {
        int row = albumPictureMapper.deleteByPrimaryKey(albumPictureId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateAlbumPictureById(AlbumPicture albumPicture) throws BlogException {
        int row = albumPictureMapper.updateByPrimaryKeySelective(albumPicture);
        return CodeMessageUtil.updateMessage(row);
    }
}
