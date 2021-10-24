package com.example.cctest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.example.cctest.**.dao"})
public class CctestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CctestApplication.class, args);
    }

}
