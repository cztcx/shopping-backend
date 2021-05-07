package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.goods.GoodsForm;
import com.chenzt.shoppingbackend.model.goods.GoodsModel;
import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController extends AbstractController {

    @Autowired
    private GoodsService goodsService;

    /*
     * 添加商品
     * */
    @RequestMapping(value = "/shop/goods", method = RequestMethod.POST)
    public void create(@RequestBody GoodsForm goodsForm) {
        goodsService.create(goodsForm);
    }

    /*
     * 根据类别ID得到所有商品
     * */
    @RequestMapping(value = "/goodsByCateID/{categoryId}", method = RequestMethod.GET)
    public List<GoodsModel> getGoodsByCID(@PathVariable String categoryId) {
        return goodsService.getGoodsByCateID(categoryId);
    }

    /*
     * 根据商品ID得到商品
     * */
    @RequestMapping(value = "/goodsByGoodsID/{goodsId}", method = RequestMethod.GET)
    public GoodsModel getGoodsByGoodsID(@PathVariable String goodsId) {
        return goodsService.getGoodsById(goodsId);
    }
}
