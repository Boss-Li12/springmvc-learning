package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Controller")
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String hello(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg","Hello,SpringMVC-Controller");
        return "test";
    }
}
