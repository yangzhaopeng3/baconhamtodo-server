package com.mattyang.baconhamtodo.service;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.Todo;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name TodoService
 * @desc TODO
 * @date 2019/11/26 18:56
 */
public interface TodoService {


    /**
     * 根据条件查询todo信息
     *
     * @param todo
     * @return
     */
    ResMsg findTodos(Todo todo);


    /**
     * 添加新的Todo记录
     *
     * @param todo
     */
    ResMsg<Todo> addTodo(Todo todo);

    /**
     * 删除todo
     *
     * @param tid
     * @return
     */
    ResMsg<Todo> deleteTodo(Integer tid);

    /**
     * 更新Todo的完成状态
     *
     * @param todo
     * @return
     */
    ResMsg updateTodo(Todo todo);
}
