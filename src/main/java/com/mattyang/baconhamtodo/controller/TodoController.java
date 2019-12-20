package com.mattyang.baconhamtodo.controller;

import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.bean.Todo;
import com.mattyang.baconhamtodo.service.TodoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name TodoController
 * @desc TODO
 * @date 2019/11/26 18:54
 */
@RestController

public class TodoController {

    @Resource(name = "todoService")
    private TodoService todoService;

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public ResMsg addTodo(Todo todo) {
        return todoService.addTodo(todo);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.DELETE)
    public ResMsg deleteTodo(Integer tid) {
        return todoService.deleteTodo(tid);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public ResMsg getTodos(Todo todo) {
        return todoService.findTodos(todo);
    }

    @RequestMapping(value = "/todo/{tid}", method = RequestMethod.GET)
    public ResMsg getTodos(@PathVariable(name = "tid") Integer tid) {
        Todo todo = new Todo();
        todo.setTid(tid);
        return todoService.findTodos(todo);
    }

    /**
     * 当提交的参数为is_done时，更新完成状态，否则更新todo信息
     *
     * @param todo
     * @return
     */
    @RequestMapping(value = "/todo", method = RequestMethod.PUT)
    public ResMsg updateFinishStatus(Todo todo) {
        return todoService.updateTodo(todo);
    }


}
