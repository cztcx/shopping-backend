package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.entity.User;
import com.chenzt.shoppingbackend.model.users.UserForm;
import com.chenzt.shoppingbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController extends AbstractController {
    @Autowired
    private UsersService usersService;

    /*
     * 用户注册
     * */
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public int create(@RequestBody UserForm userForm) {
        return usersService.create(userForm);
    }

    /*
     * 查询用户信息
     * */
    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public User retrieve(@PathVariable String userId) {
        return usersService.retrieve(userId);
    }

    /*
     * 修改用户信息
     * */
    @RequestMapping(value = "/users/update", method = RequestMethod.PUT)
    public int update(@RequestBody UserForm userForm) {
        return usersService.update(userForm);
    }

    /*
     * 注销用户
     * */
    @RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE)
    public int delete(@PathVariable String userId) {
        return usersService.delete(userId);
    }

}
