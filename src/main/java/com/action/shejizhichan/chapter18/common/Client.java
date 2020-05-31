package com.action.shejizhichan.chapter18.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 8:13
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        // 声明上下文对象
        Context context = new Context(strategy);

        // 执行封装
        context.doAnything();
    }

}
