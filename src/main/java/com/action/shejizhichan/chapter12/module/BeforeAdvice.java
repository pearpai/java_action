package com.action.shejizhichan.chapter12.module;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 23:40
 * @Version 1.0
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知...,我被执行了");
    }
}
