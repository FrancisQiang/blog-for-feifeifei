package com.lgq.domain;

public class SiteTag {
    private Integer siteTagId;

    private String siteTagName;

    private String siteTagColor;

    private String siteTagDescription;

    public Integer getSiteTagId() {
        return siteTagId;
    }

    public void setSiteTagId(Integer siteTagId) {
        this.siteTagId = siteTagId;
    }

    public String getSiteTagName() {
        return siteTagName;
    }

    public void setSiteTagName(String siteTagName) {
        this.siteTagName = siteTagName == null ? null : siteTagName.trim();
    }

    public String getSiteTagColor() {
        return siteTagColor;
    }

    public void setSiteTagColor(String siteTagColor) {
        this.siteTagColor = siteTagColor == null ? null : siteTagColor.trim();
    }

    public String getSiteTagDescription() {
        return siteTagDescription;
    }

    public void setSiteTagDescription(String siteTagDescription) {
        this.siteTagDescription = siteTagDescription == null ? null : siteTagDescription.trim();
    }
}