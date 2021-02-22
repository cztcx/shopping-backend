package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.users.UserForm;
import com.chenzt.shoppingbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController extends AbstractController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public int create(@RequestBody UserForm userForm) {
        return usersService.create(userForm);
    }
}
