package com.action.shejizhichan.chapter12.module;


import java.lang.reflect.InvocationHandler;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 23:41
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        // 定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        // 定义主题代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        // 执行行为
        proxy.doSomething("Finish");
    }

}
