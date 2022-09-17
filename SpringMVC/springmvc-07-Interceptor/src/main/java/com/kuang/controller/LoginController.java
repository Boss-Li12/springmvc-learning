package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    //跳转到首页界面
    @RequestMapping("/main")
    public String jumpMain() {
        return "main";
    }

    //跳转到登录页面
    @RequestMapping("/jumpLogin")
    public String jumpLogin() {
        return "login";
    }

    //在"登录界面"登录后，跳转到首页界面
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd, Model model) {
        //把用户信息存在Session中
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username",username);
        return "main";
    }

    //注销用户
    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("username");
        return "redirect:/index.jsp";
    }
}
