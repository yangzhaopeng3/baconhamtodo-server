package com.mattyang.baconhamtodo.service.impl;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.Todo;
import com.mattyang.baconhamtodo.dao.TodoDao;
import com.mattyang.baconhamtodo.service.TodoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name TodoServiceImpl
 * @desc TODO
 * @date 2019/11/26 18:56
 */
@Service("todoService")
public class TodoServiceImpl implements TodoService {

    /**
     * 添加新的Todo记录
     *
     * @param todo
     */

    @Resource(name = "todoDao")
    private TodoDao todoDao;

    @Override
    public ResMsg<Todo> addTodo(Todo todo) {
        todoDao.insertAndGetTid(todo);
        ResMsg<Todo> resMsg = new ResMsg<>(0, "添加Todo成功！");
        resMsg.setData(todo);
        return resMsg;
    }

    @Override
    public ResMsg<Todo> deleteTodo(Integer tid) {
        ResMsg resMsg = new ResMsg();
        todoDao.deleteByTid(tid);
        resMsg.setMsg("删除成功！");
        return resMsg;
    }

    /**
     * 根据条件查询todo信息
     *
     * @param todo
     * @return
     */
    @Override
    public ResMsg findTodos(Todo todo) {
        ResMsg resMsg = new ResMsg();
        List<Todo> todos = todoDao.findTodos(todo);
        resMsg.setData(todos);
        return resMsg;
    }

    /**
     * 更新Todo的完成状态
     *
     * @param todo
     * @return
     */
    @Override
    public ResMsg updateTodo(Todo todo) {
        if (todo.getIs_done() == null) {
            todoDao.updateTodo(todo);
        } else {
            todoDao.updateFinishStatus(todo);
        }
        return new ResMsg();
    }
}
