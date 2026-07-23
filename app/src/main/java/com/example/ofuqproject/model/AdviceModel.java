package com.example.ofuqproject.model;

public class AdviceModel {
    private String title;
    private String description;
    private int imageResId;

    public AdviceModel(String title, String description, int imageResId) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }

    // Getters and setters for the fields
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResId() {
        return imageResId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

}

