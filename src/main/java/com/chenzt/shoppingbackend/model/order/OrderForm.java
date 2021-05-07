package com.chenzt.shoppingbackend.model.order;

import com.chenzt.shoppingbackend.entity.Address;

import java.util.List;

public class OrderForm {
    private Address address;
    private List<OrderGoodsForm> orderGoodsFormList;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<OrderGoodsForm> getOrderGoodsFormList() {
        return orderGoodsFormList;
    }

    public void setOrderGoodsFormList(List<OrderGoodsForm> orderGoodsFormList) {
        this.orderGoodsFormList = orderGoodsFormList;
    }
}
