package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* RestFul的风格
* */
@Controller
public class RestFulController {
    //映射访问路径
    @RequestMapping("/commit/{a}/{b}")
    public String index(@PathVariable int a, @PathVariable int b, Model model) {
        int result = a + b;
        model.addAttribute("msg", "结果是：" + result);
        return "test";
    }

    //映射访问路径
    //@RequestMapping(value = "/hello",method = {RequestMethod.GET})
    @GetMapping(value = "/hello")
    public String index(Model model) {
        model.addAttribute("msg", "结果是：");
        return "test";
    }
}


