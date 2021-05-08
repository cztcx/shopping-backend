package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.entity.OrderHistory;
import com.chenzt.shoppingbackend.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderHistoryController extends AbstractController{
    @Autowired
    private OrderHistoryService orderHistoryService;

    /*
     * 得到订单
     * */
    @RequestMapping(value = "user/getHistoryOrders/{userId}", method = RequestMethod.GET)
    public List<OrderHistory> getUserOrders(@PathVariable String userId) {
        return orderHistoryService.getUserHistoryOrders(userId);
    }

    /*
     *  用户删除历史记录
     * */
    @RequestMapping(value = "user/deleteHisOrder/{orderHistoryId}", method = RequestMethod.DELETE)
    public int receiveGoods(@PathVariable String orderHistoryId) {
        return orderHistoryService.deleteHistoryOrders(orderHistoryId);
    }

}
