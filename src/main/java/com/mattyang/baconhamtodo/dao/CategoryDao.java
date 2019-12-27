package com.mattyang.baconhamtodo.dao;

import com.mattyang.baconhamtodo.bean.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name CategoryDao
 * @desc TODO
 * @date 2019/11/27 19:30
 */
@Repository(value = "categoryDao")
public interface CategoryDao {
    void addCategory(Category category);

    List<Category> findCategory(Integer uid);

    Category findCategoryByCid(Integer cid);

    void updateCategory(Category category);

    void deleteCategory(Integer cid);
}
