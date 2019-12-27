package com.mattyang.baconhamtodo.interceptor;

import com.mattyang.baconhamtodo.bean.User;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name LoginInterceptor
 * @desc TODO
 * @date 2019/12/27 15:43
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        // 获取用户信息，如果没有用户信息直接返回提示信息
        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.getWriter().write("Please Login In");
            return false;
        } else {
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}