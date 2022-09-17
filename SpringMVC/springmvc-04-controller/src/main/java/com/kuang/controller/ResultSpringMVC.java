package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*
* 转发和重定向
* */
@Controller
public class ResultSpringMVC {

    //以下三个测试方法均不用视图解析器
    @RequestMapping("/t1")
    public String test1(Model model){
        model.addAttribute("msg","不用视图解析器:我是转发的方式一");
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","不用视图解析器:我是转发的方式二");
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("mag","不用视图解析器:我是重定向");
        return "redirect:/index.jsp";
    }

    //以下三个测试方法均不用视图解析器
    @RequestMapping("/t4")
    public String test4(Model model){
        model.addAttribute("msg","用视图解析器：我是转发的方式一");
        return "test";
    }

    @RequestMapping("/t6")
    public String test6(Model model){
        model.addAttribute("mag","用视图解析器：我是重定向");
        return "redirect:/index.jsp";
    }
}
