package com.mattyang.baconhamtodo.service.impl;

import com.mattyang.baconhamtodo.bean.Category;
import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.dao.CategoryDao;
import com.mattyang.baconhamtodo.dao.TodoDao;
import com.mattyang.baconhamtodo.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name CategoryServiceImpl
 * @desc TODO
 * @date 2019/12/26 15:36
 */
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;
    @Resource(name = "todoDao")
    private TodoDao todoDao;

    @Override
    public ResMsg<Category> addCategory(Category category) {
        categoryDao.addCategory(category);
        ResMsg<Category> resMsg = new ResMsg<>();
        resMsg.setData(category);
        return resMsg;
    }

    @Override
    public ResMsg getCategory(Integer uid) {
        ResMsg resMsg = new ResMsg();
        List<Category> categories = categoryDao.findCategory(uid);
        resMsg.setData(categories);
        return resMsg;
    }

    @Override
    public ResMsg getCategoryByCid(Integer cid) {
        ResMsg resMsg = new ResMsg();
        Category category = categoryDao.findCategoryByCid(cid);
        resMsg.setData(category);
        return resMsg;
    }

    @Override
    public ResMsg updateCategory(Category category) {
        categoryDao.updateCategory(category);
        return new ResMsg();
    }

    @Override
    public ResMsg deleteCategory(Integer cid) {
        todoDao.deleteCategory(cid);
        categoryDao.deleteCategory(cid);
        return new ResMsg();
    }
}
