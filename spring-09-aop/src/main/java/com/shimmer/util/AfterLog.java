package com.shimmer.util;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Hui Li on 2021/1/16 22:57
 */
//切面类
public class AfterLog implements AfterReturningAdvice {

    /**
     * Callback after a given method successfully returned.
     * @param o the value returned by the method, if any
     * @param method method being invoked
     * @param objects arguments to the method
     * @param o1 target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     * Any exception thrown will be returned to the caller if it's
     * allowed by the method signature. Otherwise the exception
     * will be wrapped as a runtime exception.
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(method.getName() + "返回了" + o);
    }
}
