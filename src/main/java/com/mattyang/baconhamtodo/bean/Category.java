package com.mattyang.baconhamtodo.bean;

import java.io.Serializable;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name Category
 * @desc TODO
 * @date 2019/12/26 15:37
 */
public class Category implements Serializable {
    private Integer cid;
    private Integer uid;
    private String cname;

    public Category() {
    }

    public Category(Integer cid, Integer uid, String cname) {
        this.cid = cid;
        this.uid = uid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
