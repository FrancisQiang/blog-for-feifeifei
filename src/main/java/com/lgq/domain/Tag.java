package com.lgq.domain;

public class Tag {
    private Integer tagId;

    private String tagName;

    private String tagAlias;

    private String tagColor;

    private String tagDescription;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagAlias() {
        return tagAlias;
    }

    public void setTagAlias(String tagAlias) {
        this.tagAlias = tagAlias == null ? null : tagAlias.trim();
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor == null ? null : tagColor.trim();
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription == null ? null : tagDescription.trim();
    }
}