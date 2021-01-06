package com.chenzt.shoppingbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenzt.shoppingbackend.mapper")
public class ShoppingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingBackendApplication.class, args);
    }

}
