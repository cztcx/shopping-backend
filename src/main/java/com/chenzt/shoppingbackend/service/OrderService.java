package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Address;
import com.chenzt.shoppingbackend.entity.Goods;
import com.chenzt.shoppingbackend.entity.Orderr;
import com.chenzt.shoppingbackend.entity.OrderrExample;
import com.chenzt.shoppingbackend.mapper.CartMapper;
import com.chenzt.shoppingbackend.mapper.GoodsMapper;
import com.chenzt.shoppingbackend.mapper.OrderrMapper;
import com.chenzt.shoppingbackend.model.order.OrderCondition;
import com.chenzt.shoppingbackend.model.order.OrderForm;
import com.chenzt.shoppingbackend.model.order.OrderGoodsForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderrMapper orderrMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CartMapper cartMapper;

    public List<Orderr> getOrderList(OrderCondition orderCondition, String shopId) {
        OrderrExample orderrExample = new OrderrExample();
        OrderrExample.Criteria criteria = orderrExample.createCriteria();
        if (orderCondition.getUserName() != null) {
            criteria.andUsernameLike("%" + orderCondition.getUserName() + "%");
        }
        if (orderCondition.getGoodsName() != null) {
            criteria.andGoodsnameLike("%" + orderCondition.getGoodsName() + "%");
        }
        criteria.andShopIdEqualTo(shopId);
        return orderrMapper.selectByExample(orderrExample);
    }

    public void addOrders(OrderForm orderForm) {
        List<OrderGoodsForm> orderGoodsFormList = orderForm.getOrderGoodsFormList();
        Address address = orderForm.getAddress();
        for (int i = 0; i < orderGoodsFormList.size(); i++) {
            Orderr orderr = new Orderr();
            String id = UuidUtil.createUuid();
            orderr.setId(id);
            orderr.setAddress(address.getAddress());
            orderr.setUsername(address.getUsername());
            orderr.setPhone(address.getPhone());
            orderr.setUserId(address.getUserId());
            orderr.setGoodsId(orderGoodsFormList.get(i).getGoodsId());
            orderr.setGoodsname(orderGoodsFormList.get(i).getGoodsName());
            orderr.setCount(orderGoodsFormList.get(i).getNum());
            orderr.setPrice(orderGoodsFormList.get(i).getPrice() * orderGoodsFormList.get(i).getNum());
            orderr.setFlavor(orderGoodsFormList.get(i).getFlavor());
            orderr.setUrl(orderGoodsFormList.get(i).getUrl());

            Goods goods = goodsMapper.selectByPrimaryKey(orderGoodsFormList.get(i).getGoodsId());
            orderr.setShopId(goods.getShopId());
            orderrMapper.insert(orderr);
            cartMapper.deleteByPrimaryKey(orderGoodsFormList.get(i).getCartId());
        }
    }

    public List<Orderr> getUserOrders(String userId) {
        OrderrExample orderrExample = new OrderrExample();
        OrderrExample.Criteria criteria = orderrExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return orderrMapper.selectByExample(orderrExample);
    }
}
