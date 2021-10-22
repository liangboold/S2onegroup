package com.example.database;/*
 * @ClassName User
 * @Description TODO
 * @Author 海300
 * @Date 2021/10/22 10:24
 * @Version 1.0
 * When I wrote this, only God and I understood what I was doing.
 * Now,God only knows.
 * This code sucks, You Konw it and I Konw it.
 */

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String msg;
    @Generated(hash = 278507346)
    public User(Long id, String name, String msg) {
        this.id = id;
        this.name = name;
        this.msg = msg;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return this.msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
