package com.lgq.domain;

public class Album {
    private Integer albumId;

    private String albumName;

    private String albumDescription;

    private String ablumCover;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription == null ? null : albumDescription.trim();
    }

    public String getAblumCover() {
        return ablumCover;
    }

    public void setAblumCover(String ablumCover) {
        this.ablumCover = ablumCover == null ? null : ablumCover.trim();
    }
}