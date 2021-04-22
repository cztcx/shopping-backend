package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.*;
import com.chenzt.shoppingbackend.mapper.ManagerMapper;
import com.chenzt.shoppingbackend.mapper.UserMapper;
import com.chenzt.shoppingbackend.model.login.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ManagerMapper managerMapper;

    public List<User> userLogin(LoginForm loginForm) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(loginForm.getName());
        criteria.andPasswordEqualTo(loginForm.getPassword());

        return userMapper.selectByExample(example);
    }

    public List<Manager> managerLogin(LoginForm loginForm) {
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(loginForm.getName());
        criteria.andPasswordEqualTo(loginForm.getPassword());

        return managerMapper.selectByExample(example);
    }
}
