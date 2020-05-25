package com.action.shejizhichan.chapter07;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 7:14
 * @Version 1.0
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {
    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    // 类中的其他方法， 尽量用static
    public static void doSomething() {

    }
}
