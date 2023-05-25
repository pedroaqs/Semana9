package com.example.hellowordsem9.models;

public class Anime {

    private String title;
    private String description;
    private String picture;
    private boolean favorite;

    public Anime(String title, String description, String picture, boolean favorite) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.favorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", favorite=" + favorite +
                '}';
    }
}
