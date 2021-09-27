package com.aliciz.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Value("${hello}")
    private String hello;

    @GetMapping("hello")
    public String hello(){
        return hello;
    }
}
