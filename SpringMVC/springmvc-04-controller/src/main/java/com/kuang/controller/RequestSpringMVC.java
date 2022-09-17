package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
*
* */
@Controller
public class RequestSpringMVC {
    @RequestMapping("/r1")
    public  String hello(String name){
        System.out.println(name);
        return "test";
    }

    @RequestMapping("/r2")
    public String hello2(@RequestParam("username") String name){
        System.out.println(name);
        return "test";
    }
    @RequestMapping("/user")
    public  String user(User user){
        System.out.println(user);
        return "test";
    }
}
