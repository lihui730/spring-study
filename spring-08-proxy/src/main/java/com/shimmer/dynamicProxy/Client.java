package com.shimmer.dynamicProxy;

/**
 * Created by Hui Li on 2021/1/15 16:49
 */
public class Client {
    public static void main(String[] args) throws Throwable {
        StudentInvocationHandler handler = new StudentInvocationHandler();
        Student student = new Student(); //被代理的真实角色
        Person dynamicPerson = (Person) handler.bind(student);

        dynamicPerson.pay();

        dynamicPerson.sign();
        //handler.invoke(dynamicPerson, Person.class.getMethod("pay"), null);
    }
}
