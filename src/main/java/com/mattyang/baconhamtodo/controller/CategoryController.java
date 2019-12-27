package com.mattyang.baconhamtodo.controller;

import com.mattyang.baconhamtodo.bean.Category;
import com.mattyang.baconhamtodo.bean.ResMsg;
import com.mattyang.baconhamtodo.service.CategoryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name CategoryController
 * @desc TODO
 * @date 2019/12/26 15:34
 */
@RestController
public class CategoryController {

    @Resource(name = "categoryService")
    private CategoryService categoryService;

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ResMsg addCategory(Category category) {
        return categoryService.addCategory(category);
    }

    @RequestMapping(value = "/category/{uid}", method = RequestMethod.GET)
    public ResMsg getCategory(@PathVariable(name = "uid") Integer uid) {
        return categoryService.getCategory(uid);
    }

    @RequestMapping(value = "/cate/{cid}", method = RequestMethod.GET)
    public ResMsg getCategoryByCid(@PathVariable(name = "cid") Integer cid) {
        return categoryService.getCategoryByCid(cid);
    }

    @RequestMapping(value = "/category", method = RequestMethod.PUT)
    public ResMsg updateCategory(Category category) {
        return categoryService.updateCategory(category);
    }

    @RequestMapping(value = "/category", method = RequestMethod.DELETE)
    public ResMsg deleteCategory(Integer cid) {
        return categoryService.deleteCategory(cid);
    }
}
