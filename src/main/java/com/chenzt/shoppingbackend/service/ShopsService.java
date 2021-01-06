package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.Shop;
import com.chenzt.shoppingbackend.mapper.ShopMapper;
import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopsService {

    @Autowired
    private ShopMapper shopMapper;

    public int create(ShopsForm form, String userId) {

        Shop shop = new Shop();
        BeanUtils.copyProperties(form, shop);
        shop.setUserId(userId);

        String id = UuidUtil.createUuid();
        shop.setId(id);


        String status="0";
        shop.setStatus(status);
        String managerId="1";
        shop.setManagerId(managerId);
        return shopMapper.insertSelective(shop);
    }


}
