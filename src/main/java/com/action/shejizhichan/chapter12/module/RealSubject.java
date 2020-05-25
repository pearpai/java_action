package com.action.shejizhichan.chapter12.module;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 23:15
 * @Version 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!------> " + str);
    }
}
