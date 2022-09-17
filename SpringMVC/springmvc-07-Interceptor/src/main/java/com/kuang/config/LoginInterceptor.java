package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行：判断什么情况登录
        HttpSession session = request.getSession();

        //不是第一次登录时，就会放行
        if (session.getAttribute("userLoginInfo")!=null){
            return true;
        }
        //说明我在提交登录
        if (request.getRequestURI().contains("login")){
            return true;
        }
        //判断什么晴情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return true;
    }
}
