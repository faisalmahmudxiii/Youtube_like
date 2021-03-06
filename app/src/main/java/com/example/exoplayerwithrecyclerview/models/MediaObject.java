package com.example.exoplayerwithrecyclerview.models;

public class MediaObject {

    private String title;
    private String media_url;
    private String thumbnil;
    private String description;

    public MediaObject(String title, String media_url, String thumbnil, String description) {
        this.title = title;
        this.media_url = media_url;
        this.thumbnil = thumbnil;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

    public String getThumbnil() {
        return thumbnil;
    }

    public void setThumbnil(String thumbnil) {
        this.thumbnil = thumbnil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
