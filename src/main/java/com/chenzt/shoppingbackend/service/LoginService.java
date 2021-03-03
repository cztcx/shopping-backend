package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.ShopExample;
import com.chenzt.shoppingbackend.entity.User;
import com.chenzt.shoppingbackend.entity.UserExample;
import com.chenzt.shoppingbackend.mapper.UserMapper;
import com.chenzt.shoppingbackend.model.login.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    public List<User> login(LoginForm loginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(loginForm.getName());
        criteria.andPasswordEqualTo(loginForm.getPassword());

        return userMapper.selectByExample(example);
    }
}
