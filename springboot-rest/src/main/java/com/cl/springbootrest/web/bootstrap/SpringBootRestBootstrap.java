package com.cl.springbootrest.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: bootall
 * @description: 启动测试类
 * @author: 曹凌
 * @create: 2020-06-28 15:15
 **/
@SpringBootApplication(scanBasePackages = "com.cl.springbootrest.web")
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class, args);
    }
}
