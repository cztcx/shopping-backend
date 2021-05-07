package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Cart;
import com.chenzt.shoppingbackend.entity.CartExample;
import com.chenzt.shoppingbackend.entity.Goods;
import com.chenzt.shoppingbackend.mapper.CartMapper;
import com.chenzt.shoppingbackend.mapper.GoodsMapper;
import com.chenzt.shoppingbackend.model.cart.CartForm;
import com.chenzt.shoppingbackend.model.cart.CartModel;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    public int add(CartForm cartForm) {
        Cart cart = new Cart();
        String id = UuidUtil.createUuid();
        cart.setId(id);
        cart.setCount(cartForm.getCount());
        cart.setGoodsId(cartForm.getGoodsId());
        cart.setUserId(cartForm.getUserId());
        cart.setFlavor(cartForm.getFlavor());
        cart.setUrl(cartForm.getUrl());
        return cartMapper.insert(cart);
    }

    public List<CartModel> getCartByUserId(String userId) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<Cart> cartList = cartMapper.selectByExample(cartExample);
        List<CartModel> cartModelList = new ArrayList<>();
        for (int i = 0; i < cartList.size(); i++) {
            CartModel cartModel = new CartModel();
            Cart cart = cartList.get(i);
            Goods goods = goodsMapper.selectByPrimaryKey(cart.getGoodsId());
            cartModel.setCartId(cart.getId());
            cartModel.setService(goods.getService());
            cartModel.setFlavor(cart.getFlavor());
            cartModel.setCount(goods.getCcount());
            cartModel.setNum(cart.getCount());
            cartModel.setGoodsName(goods.getName());
            cartModel.setPrice(goods.getPrice());
            cartModel.setUrl(cart.getUrl());
            cartModel.setGoodsId(cart.getGoodsId());
            cartModelList.add(cartModel);
        }
        return cartModelList;
    }

    public int deleteSelect(List<CartModel> cartModelList) {
        int j = 0;
        for (int i = 0; i < cartModelList.size(); i++) {
            j += cartMapper.deleteByPrimaryKey(cartModelList.get(i).getCartId());
        }
        if (j == cartModelList.size()) {
            return 1;
        } else {
            return 0;
        }
    }
}
