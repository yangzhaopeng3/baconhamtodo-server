package com.mattyang.baconhamtodo.dao;

import com.mattyang.baconhamtodo.bean.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name ToDodao
 * @desc TODO
 * @date 2019/11/26 9:55
 */

@Repository("todoDao")
public interface TodoDao {

    /**
     * 查询所有Todo信息，带条件
     *
     * @param todo 不为空的字段为条件
     * @return
     */
    List<Todo> findTodos(Todo todo);

    /**
     * 更新Todo的完成状态，会自动改变为相反的状态
     *
     * @param todo
     */
    void updateFinishStatus(Todo todo);

    /**
     * 更新todo信息
     *
     * @param todo
     */
    void updateTodo(Todo todo);

    /**
     * 插入数据并返回主键
     *
     * @param todo
     */
    void insertAndGetTid(Todo todo);

    /**
     * 根据tid删除todo
     *
     * @param tid
     */
    void deleteByTid(Integer tid);

}
