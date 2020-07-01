package com.cl.springbootrest.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bootall
 * @description: 测试rest接口
 * @author: 曹凌
 * @create: 2020-06-28 15:18
 **/
@RestController
public class HelloWorldRestController {

    @GetMapping("/helloword")
    public String helloword(){
        return "helloword";
    }

}
