package com.lgq.domain;

public class Advertisement {
    private Integer advertisementId;

    private String advertisementPicture;

    private String advertisementUrl;

    private String advertisementName;

    private String advertisementDescription;

    public Integer getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAdvertisementPicture() {
        return advertisementPicture;
    }

    public void setAdvertisementPicture(String advertisementPicture) {
        this.advertisementPicture = advertisementPicture == null ? null : advertisementPicture.trim();
    }

    public String getAdvertisementUrl() {
        return advertisementUrl;
    }

    public void setAdvertisementUrl(String advertisementUrl) {
        this.advertisementUrl = advertisementUrl == null ? null : advertisementUrl.trim();
    }

    public String getAdvertisementName() {
        return advertisementName;
    }

    public void setAdvertisementName(String advertisementName) {
        this.advertisementName = advertisementName == null ? null : advertisementName.trim();
    }

    public String getAdvertisementDescription() {
        return advertisementDescription;
    }

    public void setAdvertisementDescription(String advertisementDescription) {
        this.advertisementDescription = advertisementDescription == null ? null : advertisementDescription.trim();
    }
}