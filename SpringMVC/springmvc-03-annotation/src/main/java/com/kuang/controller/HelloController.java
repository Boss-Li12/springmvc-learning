package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/h1")
    public String hello(Model model){
        //封装数据
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVCAnnotation");
        //web-inf/jsp/hello.jsp
        return "hello"; //会被视图解析器处理
    }
}
