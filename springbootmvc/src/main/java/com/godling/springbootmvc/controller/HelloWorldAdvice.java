package com.godling.springbootmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @program: bootall
 * @description: 测试切面
 * @author: 曹凌
 * @create: 2020-03-16 15:59
 **/
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldAdvice {

    @ModelAttribute("messgae")
    public String message() {
        return "fuck this shit";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        return acceptLanguage;
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handlerExcep(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}
