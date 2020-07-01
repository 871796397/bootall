package com.cl.springbootrest.web.controller;

import com.cl.springbootrest.web.domian.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @program: bootall
 * @description:
 * @author: 曹凌
 * @create: 2020-06-30 15:22
 **/
@RestController
public class PropertiesRestController {

    @PostMapping(value = "/add/properties",consumes = "text/properties;charset=UTF-8")
    public Properties echoUser(@RequestBody Properties user) {
        return user;
    }
}
