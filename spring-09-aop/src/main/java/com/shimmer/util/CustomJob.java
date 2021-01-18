package com.shimmer.util;

/**
 * Created by Hui Li on 2021/1/17 12:16
 */
public class CustomJob {
    public void beforeLog(Object any){
        System.out.println("执行方法之前");
    }

    public void afterLog(Object any){
        System.out.println("执行方法之后:" + any);
    }
}
