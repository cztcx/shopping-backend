package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopsController extends AbstractController{

    @Autowired
    private ShopsService shopsService;

    /*
     * 添加商铺
     * */
    @RequestMapping(value = "/users/{userId}/shops", method = RequestMethod.POST)
    public int create(@RequestBody ShopsForm shopsForm, @PathVariable String userId) {
        return shopsService.create(shopsForm, userId);

    }

}
