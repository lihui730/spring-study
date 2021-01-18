package com.shimmer.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Hui Li on 2021/1/17 18:20
 */
@Aspect
public class AnnotateLog {
    @Before("execution(* com.shimmer.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行前");
    }

    @After("execution(* com.shimmer.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行后");
    }

    @Around("execution(* com.shimmer.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println(jp.getSignature());

        jp.proceed(new Object[]{"test"}); //环绕，需要入参连接点！！
        System.out.println("环绕后");
    }
}
