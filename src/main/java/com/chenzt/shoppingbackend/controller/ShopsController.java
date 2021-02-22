package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.shops.ShopCondition;
import com.chenzt.shoppingbackend.model.shops.ShopModel;
import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopsController extends AbstractController {

    @Autowired
    private ShopsService shopsService;

    /*
     * 添加商铺
     * */
    @RequestMapping(value = "/users/{userId}/shops", method = RequestMethod.POST)
    public int create(@RequestBody ShopsForm shopsForm, @PathVariable String userId) {
        return shopsService.create(shopsForm, userId);
    }

    /*
     * 查看店铺信息
     * */
    @RequestMapping(value = "/shops/{shopId}", method = RequestMethod.GET)
    public ShopModel retrieve(@PathVariable String shopId) {
        return shopsService.retrieve(shopId);
    }

    /*
     * 检索店铺
     * */
    @RequestMapping(value = "/shops", method = RequestMethod.GET)
    public List<ShopModel> search(@RequestBody ShopCondition condition) {
        return shopsService.search(condition);
    }

    /*
    * 修改店铺信息
    * */
    @RequestMapping(value = "/users/{userId}/shops", method = RequestMethod.PUT)
    public int update(@RequestBody ShopsForm shopsForm, @PathVariable String userId){
        return shopsService.update(shopsForm, userId);
    }
    /*
     * 删除店铺
     * */
    @RequestMapping(value = "/shops/{shopId}", method = RequestMethod.DELETE)
    public int delete(@PathVariable String shopId){
        return shopsService.delete(shopId);
    }


}
