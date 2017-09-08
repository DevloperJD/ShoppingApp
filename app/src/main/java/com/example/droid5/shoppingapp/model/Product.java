package com.example.droid5.shoppingapp.model;

/**
 * Created by droid5 on 8/9/17.
 */

public class Product {
    private String thumbUrl,productName,FirmName,price;


    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFirmName() {
        return FirmName;
    }

    public void setFirmName(String firmName) {
        FirmName = firmName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product(String thumbUrl, String productName, String firmName, String price) {
        this.thumbUrl = thumbUrl;
        this.productName = productName;
        FirmName = firmName;
        this.price = price;


    }
}
