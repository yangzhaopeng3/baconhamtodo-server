package com.mattyang.baconhamtodo.controller;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.User;
import com.mattyang.baconhamtodo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name UserController
 * @desc TODO
 * @date 2019/11/25 19:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/login")
    public ResMsg login(User user) {
        return userService.login(user);
    }

    @RequestMapping("/register")
    public ResMsg register(User user) {
        return userService.register(user);
    }
}
