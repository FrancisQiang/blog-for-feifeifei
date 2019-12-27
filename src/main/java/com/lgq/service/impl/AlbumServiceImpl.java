package com.lgq.service.impl;

import com.lgq.dao.AlbumMapper;
import com.lgq.domain.Album;
import com.lgq.exception.BlogException;
import com.lgq.service.AlbumService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.AlbumAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumMapper albumMapper;

    @Autowired
    @SuppressWarnings("all")
    public AlbumServiceImpl(AlbumMapper albumMapper) {
        this.albumMapper = albumMapper;
    }

    @Override
    public String addAlbum(AlbumAddVO albumAddVO) throws BlogException {
        Album album = new Album();
        BeanUtils.copyProperties(albumAddVO, album);
        int row = albumMapper.insert(album);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<Album> getAll() {
        return albumMapper.selectByExample(null);
    }

    @Override
    public String deleteAlbumById(Integer albumId) throws BlogException {
        int row = albumMapper.deleteByPrimaryKey(albumId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateAlbumById(Album album) throws BlogException {
        int row = albumMapper.updateByPrimaryKeySelective(album);
        return CodeMessageUtil.updateMessage(row);
    }
}
