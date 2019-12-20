package com.mattyang.baconhamtodo.service.impl;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.User;
import com.mattyang.baconhamtodo.dao.UserDao;
import com.mattyang.baconhamtodo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name UserServiceImpl
 * @desc TODO
 * @date 2019/11/25 20:28
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;


    /**
     * 用户登录
     *
     * @param user
     * @return 返回0表示登录成功，返回1表示用户不存在，返回2表示密码错误
     */
    @Override
    public ResMsg login(User user) {
        ResMsg msg = new ResMsg();
        User user_byname = userDao.findUserByUsername(user.getUsername());
        if (user_byname == null) {
            msg.setCode(1);
            msg.setMsg("用户不存在！");
            return msg;
        }
        User user_login = userDao.findUserByUsernameAndPassword(user);
        if (user_login == null) {
            msg.setCode(2);
            msg.setMsg("密码错误！");
            return msg;
        }
        Integer uid = user_login.getUid();
        msg.setData(user_login);
        msg.setMsg("登录成功！");
        return msg;
    }

    /**
     * 用户注册
     *
     * @return code为0表示注册成功，为1表示用户名重复，为-1表示系统异常
     */
    @Override
    public ResMsg register(User user) {
        ResMsg resMsg = new ResMsg();
        User user_check = userDao.findUserByUsername(user.getUsername());
        if (user_check != null) {
            resMsg.setCode(1);
            resMsg.setMsg("用户名已被注册啦！");
        } else {
            userDao.insertUser(user);
            resMsg.setMsg("注册成功！");

        }
        return resMsg;
    }
}
