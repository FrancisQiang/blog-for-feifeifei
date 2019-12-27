package com.lgq.domain;

public class SiteFriendLink {
    private Integer friendLinkId;

    private String friendLinkName;

    private String friendLinkIconValue;

    private String friendLinkIconColor;

    private String friendLinkUrl;

    private String friendLinkDescription;

    public Integer getFriendLinkId() {
        return friendLinkId;
    }

    public void setFriendLinkId(Integer friendLinkId) {
        this.friendLinkId = friendLinkId;
    }

    public String getFriendLinkName() {
        return friendLinkName;
    }

    public void setFriendLinkName(String friendLinkName) {
        this.friendLinkName = friendLinkName == null ? null : friendLinkName.trim();
    }

    public String getFriendLinkIconValue() {
        return friendLinkIconValue;
    }

    public void setFriendLinkIconValue(String friendLinkIconValue) {
        this.friendLinkIconValue = friendLinkIconValue == null ? null : friendLinkIconValue.trim();
    }

    public String getFriendLinkIconColor() {
        return friendLinkIconColor;
    }

    public void setFriendLinkIconColor(String friendLinkIconColor) {
        this.friendLinkIconColor = friendLinkIconColor == null ? null : friendLinkIconColor.trim();
    }

    public String getFriendLinkUrl() {
        return friendLinkUrl;
    }

    public void setFriendLinkUrl(String friendLinkUrl) {
        this.friendLinkUrl = friendLinkUrl == null ? null : friendLinkUrl.trim();
    }

    public String getFriendLinkDescription() {
        return friendLinkDescription;
    }

    public void setFriendLinkDescription(String friendLinkDescription) {
        this.friendLinkDescription = friendLinkDescription == null ? null : friendLinkDescription.trim();
    }
}