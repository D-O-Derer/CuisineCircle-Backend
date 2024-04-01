package com.example.cuisineservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.cuisineservice.mapper")//set the map
public class CuisineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuisineServiceApplication.class, args);
    }

}
