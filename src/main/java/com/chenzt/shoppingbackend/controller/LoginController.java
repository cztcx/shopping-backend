package com.chenzt.shoppingbackend.controller;

import com.chenzt.shoppingbackend.model.login.LoginForm;
import com.chenzt.shoppingbackend.service.LoginService;
import com.chenzt.shoppingbackend.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController extends AbstractController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Map> login(@RequestBody LoginForm loginForm) {
        Map map = new HashMap();
        if (loginService.login(loginForm).size() > 0) {

            String Token = UuidUtil.createUuid();
            map.put("data", ResponseEntity.ok(loginService.login(loginForm)));
            map.put("token", Token);
            return ResponseEntity.ok(map);
        }
        return ResponseEntity.ok(map);

    }

}
