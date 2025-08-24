package com.example.demospringboot4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyyst
 * @Description
 * @Create by 2025/8/24 14:46
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(){
        return "hello";
    }
}
