package com.mattyang.baconhamtodo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name ToDo
 * @desc TODO
 * @date 2019/11/26 9:57
 */
public class Todo implements Serializable {
    private Integer tid;
    private String title;
    private String detail;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Integer uid;
    private Integer cid;
    private Integer is_done;

    public Todo() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getIs_done() {
        return is_done;
    }

    public void setIs_done(Integer is_done) {
        this.is_done = is_done;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "tid=" + tid +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", date=" + date +
                ", uid=" + uid +
                ", cid=" + cid +
                ", is_done=" + is_done +
                '}';
    }
}
