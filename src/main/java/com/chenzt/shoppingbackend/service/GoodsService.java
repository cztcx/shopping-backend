package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.*;
import com.chenzt.shoppingbackend.mapper.FlavorMapper;
import com.chenzt.shoppingbackend.mapper.GoodsMapper;
import com.chenzt.shoppingbackend.mapper.ImgMapper;
import com.chenzt.shoppingbackend.model.flavor.FlavorForm;
import com.chenzt.shoppingbackend.model.goods.GoodsForm;
import com.chenzt.shoppingbackend.model.goods.GoodsModel;
import com.chenzt.shoppingbackend.model.img.ImgForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private ImgMapper imgMapper;
    @Autowired
    private FlavorMapper flavorMapper;

    public void create(GoodsForm goodsForm) {
        String id = UuidUtil.createUuid();
        Goods goods = new Goods();
        BeanUtils.copyProperties(goodsForm, goods);
        goods.setId(id);
        goodsMapper.insert(goods);

        List<ImgForm> imgFormList = goodsForm.getImgFormList();
        for (int i = 0; i < imgFormList.size(); i++) {
            Img img = new Img();
            if (imgFormList.get(i) != null) {
                String ImgId = UuidUtil.createUuid();
                img.setId(ImgId);
                img.setGoodsId(id);
                img.setName(imgFormList.get(i).getName());
                img.setUrl(imgFormList.get(i).getUrl());
                imgMapper.insert(img);
            }
        }
        List<FlavorForm> flavorFormList = goodsForm.getFlavorFormList();
        for (int i = 0; i < flavorFormList.size(); i++) {
            Flavor flavor = new Flavor();
            if (flavorFormList.get(i) != null) {
                String Fid = UuidUtil.createUuid();
                flavor.setId(Fid);
                flavor.setFlavor(flavorFormList.get(i).getFlavor());
                flavor.setGoodsId(id);
                flavorMapper.insert(flavor);
            }
        }
    }

    public List<GoodsModel> getGoodsByCateID(String categoryId) {
        List<GoodsModel> goodsModelList = new ArrayList<>();
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCategoryIdEqualTo(categoryId);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        for (Goods goods : goodsList) {
            GoodsModel goodsModel = new GoodsModel();
            String goodsId = goods.getId();
            ImgExample imgExample = new ImgExample();
            ImgExample.Criteria criteria1 = imgExample.createCriteria();
            criteria1.andGoodsIdEqualTo(goodsId);
            List<Img> imgList = imgMapper.selectByExample(imgExample);
            goodsModel.setGoods(goods);
            goodsModel.setImgList(imgList);
            goodsModelList.add(goodsModel);
        }
        return goodsModelList;
    }

    public List<GoodsModel> getGoodsByShopId(String shopId) {
        List<GoodsModel> goodsModelList = new ArrayList<>();
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        String status = "1";
        criteria.andShopIdEqualTo(shopId);
        criteria.andStatusEqualTo(status);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        for (Goods goods : goodsList) {
            GoodsModel goodsModel = new GoodsModel();
            String goodsId = goods.getId();
            FlavorExample flavorExample = new FlavorExample();
            FlavorExample.Criteria FCriteria = flavorExample.createCriteria();
            FCriteria.andGoodsIdEqualTo(goodsId);
            List<Flavor> flavorList = flavorMapper.selectByExample(flavorExample);
            ImgExample imgExample = new ImgExample();
            ImgExample.Criteria criteria1 = imgExample.createCriteria();
            criteria1.andGoodsIdEqualTo(goodsId);
            List<Img> imgList = imgMapper.selectByExample(imgExample);
            goodsModel.setFlavorList(flavorList);
            goodsModel.setGoods(goods);
            goodsModel.setImgList(imgList);
            goodsModelList.add(goodsModel);
        }
        return goodsModelList;
    }

    public List<GoodsModel> getGoodsDownByShopId(String shopId) {
        List<GoodsModel> goodsModelList = new ArrayList<>();
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        String status = "0";
        criteria.andShopIdEqualTo(shopId);
        criteria.andStatusEqualTo(status);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        for (Goods goods : goodsList) {
            GoodsModel goodsModel = new GoodsModel();
            String goodsId = goods.getId();
            FlavorExample flavorExample = new FlavorExample();
            FlavorExample.Criteria FCriteria = flavorExample.createCriteria();
            FCriteria.andGoodsIdEqualTo(goodsId);
            List<Flavor> flavorList = flavorMapper.selectByExample(flavorExample);
            ImgExample imgExample = new ImgExample();
            ImgExample.Criteria criteria1 = imgExample.createCriteria();
            criteria1.andGoodsIdEqualTo(goodsId);
            List<Img> imgList = imgMapper.selectByExample(imgExample);
            goodsModel.setFlavorList(flavorList);
            goodsModel.setGoods(goods);
            goodsModel.setImgList(imgList);
            goodsModelList.add(goodsModel);
        }
        return goodsModelList;
    }

    public int goodsDown(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        goods.setStatus("0");
        return goodsMapper.updateByPrimaryKey(goods);
    }

    public int goodsUp(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        goods.setStatus("1");
        return goodsMapper.updateByPrimaryKey(goods);
    }

    public GoodsModel getGoodsById(String goodsID) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsID);
        GoodsModel goodsModel = new GoodsModel();
        goodsModel.setGoods(goods);

        ImgExample imgExample = new ImgExample();
        ImgExample.Criteria IMGCriteria = imgExample.createCriteria();
        IMGCriteria.andGoodsIdEqualTo(goodsID);
        List<Img> imgList = imgMapper.selectByExample(imgExample);
        goodsModel.setImgList(imgList);

        FlavorExample flavorExample = new FlavorExample();
        FlavorExample.Criteria FCriteria = flavorExample.createCriteria();
        FCriteria.andGoodsIdEqualTo(goodsID);
        List<Flavor> flavorList = flavorMapper.selectByExample(flavorExample);
        goodsModel.setFlavorList(flavorList);

        return goodsModel;
    }
}
