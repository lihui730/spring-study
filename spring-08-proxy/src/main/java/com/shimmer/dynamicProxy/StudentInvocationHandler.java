package com.shimmer.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Hui Li on 2021/1/15 16:28
 */

//学生动态代理Handler，用于生成动态代理类
public class StudentInvocationHandler implements InvocationHandler {

    private Object object;

    /**
     * 创建动态代理对象，并返回
     * @param object 被代理的真实对象
     * @return 被封装成Proxy0的动态代理对象
     */
    public Object bind(Object object) {
        this.object = object;
        Object proxy = Proxy.newProxyInstance(
                object.getClass().getClassLoader(), // 被代理类的URL
                object.getClass().getInterfaces(),  // 被代理类中的接口方法
                this);

        System.out.println(proxy.getClass().toString());
        return proxy;
    }

    /**
     * Proxyh会调用该方法，执行动态代理对象的接口方法
     * @param proxy 动态代理对象
     * @param method 接口方法
     * @param args 接口入参
     * @return
     * @throws Throwable
     */

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理");
        // 调用这个代理实例中的method，并传参
        return method.invoke(this.object, args);
    }
}
