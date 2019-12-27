package com.lgq.domain;

public class SiteIcon {
    private Integer siteIconId;

    private String siteIconName;

    private String siteIconColor;

    private String siteIconUrl;

    private String siteIconValue;

    private String siteIconDescription;

    public Integer getSiteIconId() {
        return siteIconId;
    }

    public void setSiteIconId(Integer siteIconId) {
        this.siteIconId = siteIconId;
    }

    public String getSiteIconName() {
        return siteIconName;
    }

    public void setSiteIconName(String siteIconName) {
        this.siteIconName = siteIconName == null ? null : siteIconName.trim();
    }

    public String getSiteIconColor() {
        return siteIconColor;
    }

    public void setSiteIconColor(String siteIconColor) {
        this.siteIconColor = siteIconColor == null ? null : siteIconColor.trim();
    }

    public String getSiteIconUrl() {
        return siteIconUrl;
    }

    public void setSiteIconUrl(String siteIconUrl) {
        this.siteIconUrl = siteIconUrl == null ? null : siteIconUrl.trim();
    }

    public String getSiteIconValue() {
        return siteIconValue;
    }

    public void setSiteIconValue(String siteIconValue) {
        this.siteIconValue = siteIconValue == null ? null : siteIconValue.trim();
    }

    public String getSiteIconDescription() {
        return siteIconDescription;
    }

    public void setSiteIconDescription(String siteIconDescription) {
        this.siteIconDescription = siteIconDescription == null ? null : siteIconDescription.trim();
    }
}