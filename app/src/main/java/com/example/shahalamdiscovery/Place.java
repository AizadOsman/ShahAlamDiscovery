package com.example.shahalamdiscovery;

import java.io.Serializable;

public class Place implements Serializable {
    private String title;
    private String price;
    private int imageResId;
    private String location;
    private String description;

    public Place(String title, String price, int imageResId, String location, String description) {
        this.title = title;
        this.price = price;
        this.imageResId = imageResId;
        this.location = location;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
