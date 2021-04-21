package com.wgc.springbootpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // person.last-name=Tom
    //@Value("${person.last-name}")
    //private String name;

    @RequestMapping("/hello")
    public String hello() {
        //return "Hello World!" + name;
        return "Hello World!";
    }
}
