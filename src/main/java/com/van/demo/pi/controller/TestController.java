package com.van.demo.pi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jar")
public class TestController {

    @RequestMapping("/test")
    public Object testAnnotation(){
        return new String("you got me    ---from van's RaspBerry");
    }
}
