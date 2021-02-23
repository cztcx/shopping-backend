package com.chenzt.shoppingbackend.service;

import com.chenzt.shoppingbackend.entity.User;
import com.chenzt.shoppingbackend.mapper.UserMapper;
import com.chenzt.shoppingbackend.model.users.UserForm;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserMapper userMapper;

    /*
     * 用户注册
     * */
    public int create(UserForm userForm) {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        String id = UuidUtil.createUuid();
        user.setId(id);
        String isseller = "0";
        user.setIsseller(isseller);
        return userMapper.insert(user);
    }

    /*
     * 查询用户信息
     * */
    public User retrieve(String userID) {
        return userMapper.selectByPrimaryKey(userID);
    }

    /*
     * 修改用户信息
     * */
    public int update(UserForm userForm, String userId) {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        user.setId(userId);
        return userMapper.updateByPrimaryKeySelective(user);
    }
    /*
     * 注销用户信息
     * */
    public int delete(String userID) {
        return userMapper.deleteByPrimaryKey(userID);
    }
}
