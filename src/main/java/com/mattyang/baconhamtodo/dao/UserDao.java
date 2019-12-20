package com.mattyang.baconhamtodo.dao;

import com.mattyang.baconhamtodo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name UserDao
 * @desc TODO
 * @date 2019/11/24 20:26
 */

@Repository("userDao")
public interface UserDao {
    List<User> findUsers();

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    /**
     * 根据用户名和密码查找用户
     *
     * @param user
     * @return
     */
    User findUserByUsernameAndPassword(User user);

    /**
     * 插入新的User
     *
     * @param user
     */
    void insertUser(User user);
}
