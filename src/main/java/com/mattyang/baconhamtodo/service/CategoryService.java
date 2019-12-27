package com.mattyang.baconhamtodo.service;

import com.mattyang.baconhamtodo.bean.Category;
import com.mattyang.baconhamtodo.bean.ResMsg;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name CategoryService
 * @desc TODO
 * @date 2019/12/26 15:36
 */
public interface CategoryService {
    ResMsg<Category> addCategory(Category category);

    ResMsg getCategory(Integer uid);

    ResMsg getCategoryByCid(Integer cid);

    ResMsg updateCategory(Category category);

    ResMsg deleteCategory(Integer cid);
}
