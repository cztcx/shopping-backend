package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.entity.User;
import com.chenzt.shoppingbackend.model.login.LoginForm;
import com.chenzt.shoppingbackend.service.LoginService;
import com.chenzt.shoppingbackend.util.JWTUtil;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController extends AbstractController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody LoginForm loginForm) {

        List<User> user = loginService.login(loginForm);
        Map<String, Object> map = new HashMap<>();
        if (user.size() > 0) {
            Map<String, String> payload = new HashMap<>();
            payload.put("userid", user.get(0).getId());
            payload.put("username", user.get(0).getName());
            String Token = JWTUtil.getToken(payload);
            map.put("state", true);
            map.put("msg", "认证成功");
            map.put("token",Token);
        }else {
            map.put("state", false);
            map.put("msg", "认证失败");
        }
        return map;

    }

}
