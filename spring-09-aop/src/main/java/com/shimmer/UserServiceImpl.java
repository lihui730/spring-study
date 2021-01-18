package com.shimmer;

/**
 * Created by Hui Li on 2021/1/16 22:43
 */
public class UserServiceImpl implements UserService{
    private Object any;
    public void add() {
        System.out.println("执行新增操作");
    }

    public boolean delete() {
        System.out.println("执行删除操作");
        return true;
    }

    public boolean update(String any) {
        System.out.println("执行更新操作:"+ any);
        this.any = any;
        return true;
    }

    public String select() {
        System.out.println("执行查询操作");
        return "ok";
    }

    public Object getAny() {
        return any;
    }

    public void setAny(Object any) {
        this.any = any;
    }
}
