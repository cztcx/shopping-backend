package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.entity.Address;
import com.chenzt.shoppingbackend.model.address.AddressForm;
import com.chenzt.shoppingbackend.model.cart.CartForm;
import com.chenzt.shoppingbackend.model.shops.ShopsForm;
import com.chenzt.shoppingbackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController extends AbstractController {
    @Autowired
    private AddressService addressService;

    /*
     * 得到用户所有地址
     * */
    @RequestMapping(value = "/user/getAddress/{userId}", method = RequestMethod.GET)
    public List<Address> getAll(@PathVariable String userId) {
        return addressService.getAll(userId);
    }

    /*
     * 添加新收货人
     * */
    @RequestMapping(value = "/address/add", method = RequestMethod.POST)
    public int create(@RequestBody AddressForm addressForm) {
        return addressService.create(addressForm);
    }

    /*
     * 修改地址信息
     * */
    @RequestMapping(value = "/address/update", method = RequestMethod.PUT)
    public int update(@RequestBody AddressForm addressForm) {
        return addressService.update(addressForm);
    }

    /*
     * 根据id得到用户地址信息
     * */
    @RequestMapping(value = "/user/getOneAddress/{addressId}", method = RequestMethod.GET)
    public Address retrieve(@PathVariable String addressId) {
        return addressService.retrieve(addressId);
    }

    /*
     * 根据ID删除地址信息
     * */
    @RequestMapping(value = "/user/deleteAddress/{addressId}", method = RequestMethod.DELETE)
    public int delete(@PathVariable String addressId) {
        return addressService.delete(addressId);
    }

}
