package com.lgq.dao;

import com.lgq.domain.AlbumPicture;
import com.lgq.domain.AlbumPictureExample;
import java.util.List;

import com.lgq.dto.AlbumPictureGetDTO;
import org.apache.ibatis.annotations.Param;

public interface AlbumPictureMapper {
    long countByExample(AlbumPictureExample example);

    int deleteByExample(AlbumPictureExample example);

    int deleteByPrimaryKey(Integer albumPictureId);

    int insert(AlbumPicture record);

    int insertSelective(AlbumPicture record);

    List<AlbumPicture> selectByExample(AlbumPictureExample example);

    AlbumPicture selectByPrimaryKey(Integer albumPictureId);

    int updateByExampleSelective(@Param("record") AlbumPicture record, @Param("example") AlbumPictureExample example);

    int updateByExample(@Param("record") AlbumPicture record, @Param("example") AlbumPictureExample example);

    int updateByPrimaryKeySelective(AlbumPicture record);

    int updateByPrimaryKey(AlbumPicture record);

    List<AlbumPictureGetDTO> getAlbumPictureGetDTOList();
}