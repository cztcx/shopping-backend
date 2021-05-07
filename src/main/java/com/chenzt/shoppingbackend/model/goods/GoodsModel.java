package com.chenzt.shoppingbackend.model.goods;

import com.chenzt.shoppingbackend.entity.Flavor;
import com.chenzt.shoppingbackend.entity.Goods;
import com.chenzt.shoppingbackend.entity.Img;

import java.util.List;

public class GoodsModel {
    private Goods goods;
    private List<Img> imgList;
    private List<Flavor> flavorList;

    public List<Flavor> getFlavorList() {
        return flavorList;
    }

    public void setFlavorList(List<Flavor> flavorList) {
        this.flavorList = flavorList;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public List<Img> getImgList() {
        return imgList;
    }

    public void setImgList(List<Img> imgList) {
        this.imgList = imgList;
    }
}
