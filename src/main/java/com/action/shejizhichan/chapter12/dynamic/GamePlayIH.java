package com.action.shejizhichan.chapter12.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 21:08
 * @Version 1.0
 */
public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls = null;

    // 被代理实例
    Object obj = null;

    // 我要代理谁


    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录");
        }
        return result;
    }
}
