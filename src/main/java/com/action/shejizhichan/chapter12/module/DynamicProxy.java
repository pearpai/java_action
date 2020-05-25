package com.action.shejizhichan.chapter12.module;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 23:36
 * @Version 1.0
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        //寻找JoinPoint 连接点， AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

}
