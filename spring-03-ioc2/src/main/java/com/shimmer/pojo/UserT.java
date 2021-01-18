package com.shimmer.pojo;

/**
 * Created by Hui Li on 2021/1/2 10:13
 */
public class UserT {
    private String name;

    public UserT(){
        System.out.println("UserT被创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("user t name=" + name);
    }
}
