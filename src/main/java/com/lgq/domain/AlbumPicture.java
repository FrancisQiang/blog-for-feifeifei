package com.lgq.domain;

public class AlbumPicture {
    private Integer albumPictureId;

    private String albumPictureUrl;

    private Integer albumPictureCategory;

    private String albumPictureName;

    private String albumPictureDescription;

    public Integer getAlbumPictureId() {
        return albumPictureId;
    }

    public void setAlbumPictureId(Integer albumPictureId) {
        this.albumPictureId = albumPictureId;
    }

    public String getAlbumPictureUrl() {
        return albumPictureUrl;
    }

    public void setAlbumPictureUrl(String albumPictureUrl) {
        this.albumPictureUrl = albumPictureUrl == null ? null : albumPictureUrl.trim();
    }

    public Integer getAlbumPictureCategory() {
        return albumPictureCategory;
    }

    public void setAlbumPictureCategory(Integer albumPictureCategory) {
        this.albumPictureCategory = albumPictureCategory;
    }

    public String getAlbumPictureName() {
        return albumPictureName;
    }

    public void setAlbumPictureName(String albumPictureName) {
        this.albumPictureName = albumPictureName == null ? null : albumPictureName.trim();
    }

    public String getAlbumPictureDescription() {
        return albumPictureDescription;
    }

    public void setAlbumPictureDescription(String albumPictureDescription) {
        this.albumPictureDescription = albumPictureDescription == null ? null : albumPictureDescription.trim();
    }
}