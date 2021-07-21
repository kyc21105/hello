package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String index() {
        return "Main Page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
