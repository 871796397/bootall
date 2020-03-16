package com.godling.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with 87179
 * Description: 测试webmvc接口 HelloWorld {@link Controller}
 * Date: 2020-03-16
 * Time: 10:25
 * Project: bootall
 *
 * @author 87179
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
