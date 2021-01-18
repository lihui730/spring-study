package com.shimmer.dynamicProxy;

/**
 * Created by Hui Li on 2021/1/15 16:26
 */
//实际角色
public class Student implements Person {

    public void pay() {
        System.out.println("学生交班费");
    }

    public void sign() {
        System.out.println("学生签到");
    }
}
