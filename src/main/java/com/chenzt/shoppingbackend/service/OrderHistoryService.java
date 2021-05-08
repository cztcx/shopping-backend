package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.OrderHistory;
import com.chenzt.shoppingbackend.entity.OrderHistoryExample;
import com.chenzt.shoppingbackend.mapper.OrderHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryService {
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    public List<OrderHistory> getUserHistoryOrders(String userId) {
        OrderHistoryExample orderHistoryExample = new OrderHistoryExample();
        OrderHistoryExample.Criteria criteria = orderHistoryExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return orderHistoryMapper.selectByExample(orderHistoryExample);
    }

    public int deleteHistoryOrders(String orderHistoryId){
        return orderHistoryMapper.deleteByPrimaryKey(orderHistoryId);
    }
}
