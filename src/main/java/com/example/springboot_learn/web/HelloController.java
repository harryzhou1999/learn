package com.example.springboot_learn.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello456")
    public String hello123(){
        return "hello world!";
    }

    @RequestMapping("/good")
    public String good(){
        return "good!";
    }




}
