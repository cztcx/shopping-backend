package com.chenzt.shoppingbackend.model.goods;

import com.chenzt.shoppingbackend.entity.Img;
import com.chenzt.shoppingbackend.model.flavor.FlavorForm;
import com.chenzt.shoppingbackend.model.img.ImgForm;

import java.util.List;

public class GoodsForm {
    private double price;
    private String name;
    private Integer ccount;
    private String status;
    private String introduction;
    private String categoryId;
    private String shopId;
    private String service;
    private List<ImgForm> imgFormList;
    private List<FlavorForm> flavorFormList;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public List<FlavorForm> getFlavorFormList() {
        return flavorFormList;
    }

    public void setFlavorFormList(List<FlavorForm> flavorFormList) {
        this.flavorFormList = flavorFormList;
    }

    public Integer getCcount() {
        return ccount;
    }

    public void setCcount(Integer ccount) {
        this.ccount = ccount;
    }

    public List<ImgForm> getImgFormList() {
        return imgFormList;
    }

    public void setImgFormList(List<ImgForm> imgFormList) {
        this.imgFormList = imgFormList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
