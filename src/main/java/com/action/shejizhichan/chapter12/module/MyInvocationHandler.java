package com.action.shejizhichan.chapter12.module;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 23:16
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {

    // 被代理对象
    private Object target = null;

    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    // 代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行代理方法
        return method.invoke(this.target, args);
    }
}
