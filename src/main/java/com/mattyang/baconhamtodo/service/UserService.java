package com.mattyang.baconhamtodo.service;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.User;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name UserService
 * @desc TODO
 * @date 2019/11/25 20:25
 */

public interface UserService {

    /**
     * 用户注册
     *
     * @return
     */
    ResMsg register(User user);

    /**
     * 登录
     *
     * @param user
     * @return
     */
    ResMsg login(User user);
}
