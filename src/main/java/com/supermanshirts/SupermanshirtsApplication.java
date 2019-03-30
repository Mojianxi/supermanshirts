package com.supermanshirts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.supermanshirts.mapper")
public class SupermanshirtsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupermanshirtsApplication.class, args);
    }
}
