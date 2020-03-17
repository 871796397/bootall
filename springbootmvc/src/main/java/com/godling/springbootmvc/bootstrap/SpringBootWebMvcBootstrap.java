package com.godling.springbootmvc.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringBootWebMvc 引导类
 * @description:
 * @author: 曹凌
 * @create: 2020-03-17 15:45
 **/
@SpringBootApplication(scanBasePackages = "com.godling.springbootmvc")
public class SpringBootWebMvcBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class, args);
    }
}
