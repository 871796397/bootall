package com.cl.springbootrest.web.controller;

import com.cl.springbootrest.web.domian.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bootall
 * @description: UserRestController
 * @author: 曹凌
 * @create: 2020-06-28 16:24
 **/
@RestController
public class UserRestController {

    @PostMapping(value = "/echo/user",produces = "application/json;charset=GBK")
    public User echoUser(@RequestBody User user) {
        return user;
    }
}
