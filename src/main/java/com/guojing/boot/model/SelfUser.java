package com.guojing.boot.model;

import java.io.Serializable;

public class SelfUser implements Serializable {
    private static final long serialVersionUID = -1L;
    private String username;
    private Integer age;
    public SelfUser(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
    // 省略getter和setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}