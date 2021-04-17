package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Orderr;
import com.chenzt.shoppingbackend.entity.OrderrExample;
import com.chenzt.shoppingbackend.mapper.GoodsMapper;
import com.chenzt.shoppingbackend.mapper.OrderrMapper;
import com.chenzt.shoppingbackend.model.order.OrderCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderrMapper orderrMapper;
    @Autowired
    private GoodsMapper goodsMapper;

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
}
