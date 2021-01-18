package com.shimmer.util;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Hui Li on 2021/1/16 22:44
 */
//切面类
public class BeforeLog implements MethodBeforeAdvice {

    /**
     * 切面通知
     * @param method
     * @param objects
     * @param o
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行" + o.getClass().getName() + "的" + method.getName());
        //method.invoke(o, objects); //不需要调这个invoke,如果调了,真实角色的方法会被执行两次
    }
}
