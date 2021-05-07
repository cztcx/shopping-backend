package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.cart.CartForm;
import com.chenzt.shoppingbackend.model.cart.CartModel;
import com.chenzt.shoppingbackend.model.goods.GoodsModel;
import com.chenzt.shoppingbackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController extends AbstractController{

    @Autowired
    private CartService cartService;

    /*
     * 加入购物车
     * */
    @RequestMapping(value = "/cart/add", method = RequestMethod.POST)
    public void create(@RequestBody CartForm cartForm) {
        cartService.add(cartForm);
    }

    /*
     * 根据用户ID得到购物车内所有商品
     * */
    @RequestMapping(value = "/getCartByUserID/{userId}", method = RequestMethod.GET)
    public List<CartModel> getCartByUserID(@PathVariable String userId) {
        return cartService.getCartByUserId(userId);
    }
    /*
     * 删除所选购物车物品
     * */
    @RequestMapping(value = "/cart/deleteSelect", method = RequestMethod.DELETE)
    public int deleteSelect(@RequestBody List<CartModel> cartModelList){
        return cartService.deleteSelect(cartModelList);
    }

}
