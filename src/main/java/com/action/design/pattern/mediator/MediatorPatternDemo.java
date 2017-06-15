package com.action.design.pattern.mediator;

/**
 * 使用User对象来显示他们之间的通信
 * Created by wuyunfeng on 2017/6/15.
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User rober = new User("Robert");
        User john = new User("John");


        rober.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
