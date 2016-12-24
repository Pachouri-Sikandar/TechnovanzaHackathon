package com.pachouri.technovanzahackathon.model;

/**
 * Created by ankit on 12/24/16.
 */
public class NewsListModel {
    private String name;
    private String time;
    private String city;
    private String description;
    private String comments;
    private String userImageUrl;
    private String newImageUrl;

    public NewsListModel(String name, String time, String city, String description, String
            comments, String userImageUrl, String newImageUrl) {
        this.name = name;
        this.time = time;
        this.city = city;
        this.description = description;
        this.comments = comments;
        this.userImageUrl = newImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getNewImageUrl() {
        return newImageUrl;
    }

    public void setNewImageUrl(String newImageUrl) {
        this.newImageUrl = newImageUrl;
    }
}
