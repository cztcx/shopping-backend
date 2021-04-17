package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.entity.Orderr;
import com.chenzt.shoppingbackend.model.order.OrderCondition;
import com.chenzt.shoppingbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController extends AbstractController{

    @Autowired
    private OrderService orderService;

    /*
     * 检索订单
     * */
    @RequestMapping(value = "shops/{shopId}/order", method = RequestMethod.GET)
    public List<Orderr> getOrder(@RequestBody OrderCondition orderCondition, @PathVariable String shopId) {
        return orderService.getOrderList(orderCondition, shopId);
    }
}
