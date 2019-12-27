package com.lgq.domain;

public class Site {
    private Integer siteId;

    private String siteTitile;

    private String siteSubtitle;

    private String siteDescription;

    private String siteLogo;

    private String siteAvatar;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteTitile() {
        return siteTitile;
    }

    public void setSiteTitile(String siteTitile) {
        this.siteTitile = siteTitile == null ? null : siteTitile.trim();
    }

    public String getSiteSubtitle() {
        return siteSubtitle;
    }

    public void setSiteSubtitle(String siteSubtitle) {
        this.siteSubtitle = siteSubtitle == null ? null : siteSubtitle.trim();
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription == null ? null : siteDescription.trim();
    }

    public String getSiteLogo() {
        return siteLogo;
    }

    public void setSiteLogo(String siteLogo) {
        this.siteLogo = siteLogo == null ? null : siteLogo.trim();
    }

    public String getSiteAvatar() {
        return siteAvatar;
    }

    public void setSiteAvatar(String siteAvatar) {
        this.siteAvatar = siteAvatar == null ? null : siteAvatar.trim();
    }
}