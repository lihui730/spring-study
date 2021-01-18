package com.shimmer.pojo;

/**
 * Created by Hui Li on 2021/1/1 16:41
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    //被spring托管，通过set方法实现注入
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
