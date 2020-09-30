package com.qfedu.entity;

import java.util.Date;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/30 9:44
 * description:
 */
public class Depart {
    private int id;
    private String name;
    private Date createtime;
    private int flag;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", flag=" + flag +
                ", num=" + num +
                '}';
    }

    public Depart(int id, String name, Date createtime, int flag, int num) {
        this.id = id;
        this.name = name;
        this.createtime = createtime;
        this.flag = flag;
        this.num = num;
    }

    public Depart() {
    }


}
