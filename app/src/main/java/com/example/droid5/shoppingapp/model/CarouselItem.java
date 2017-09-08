package com.example.droid5.shoppingapp.model;

/**
 * Created by droid5 on 8/9/17.
 */

public class CarouselItem {
    private String thumbUrl;

    public CarouselItem(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }
}
