package com.lgq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lgq.dao")
public class FrancisBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrancisBlogApplication.class, args);
    }

}
