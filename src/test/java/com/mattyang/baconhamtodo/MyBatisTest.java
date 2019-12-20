package com.mattyang.baconhamtodo;

import com.mattyang.baconhamtodo.bean.Todo;
import com.mattyang.baconhamtodo.dao.TodoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name MyBatisTest
 * @desc TODO
 * @date 2019/11/26 19:01
 */

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MyBatisTest {

    @Autowired
    private TodoDao todoDao;

    @Test
    @Rollback
    public void insertTest() {
        Todo todo = new Todo();
        todo.setTitle("test");
        System.out.println(todo);
        todo.setUid(2);
        todoDao.insertAndGetTid(todo);
        System.out.println(todo);
    }

    @Test
    @Rollback
    public void testFind() {
        Todo todo = new Todo();
        todo.setTid(6);
        List<Todo> todos = todoDao.findTodos(todo);
        System.out.println(todos);
    }
}
