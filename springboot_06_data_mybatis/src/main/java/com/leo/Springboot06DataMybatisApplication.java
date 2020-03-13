package com.leo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.leo.mapper")
public class Springboot06DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06DataMybatisApplication.class, args);
    }

}
