package com.chenzt.shoppingbackend.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;
/*
* JSON Web Tokens token工具类
* */
public class JWTUtil {

    private static final String SINGURATER = "!D#E$R%TY7D8#899*UYJ&E*";
    /*
     * 生成token    header.payload.singurater
     * */
    public static String getToken(Map<String, String> map) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 1);//默认7天过期
        // 创建builder
        JWTCreator.Builder builder = JWT.create();

        //payload
        map.forEach((k, v) -> builder.withClaim(k, v));
        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(SINGURATER));

        return token;
    }

    /*
     * 验证token 合法性
     * */
    public static void verify(String token) {
        JWT.require(Algorithm.HMAC256(SINGURATER)).build().verify(token);
    }

    /*
     * 获取token信息方法
     * */
    public static DecodedJWT getTokenInfo(String token) {
        DecodedJWT verify = JWT.require(Algorithm.HMAC256(SINGURATER)).build().verify(token);
        return verify;
    }
}
