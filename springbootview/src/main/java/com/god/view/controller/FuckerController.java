package com.god.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: bootall
 * @description: 接口返回页面测试 {@link org.springframework.stereotype.Controller}
 * @author: 曹凌
 * @create: 2020-03-20 16:06
 **/
@Controller
public class FuckerController {

    @GetMapping("/fucker")
    public String fucker() {
        return "fucker";
    }

    @ModelAttribute("message")
    public String message() {
        return "fuck them";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
