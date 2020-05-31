package com.action.shejizhichan.chapter18.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 8:09
 * @Version 1.0
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体都策略1运算法则");
    }
}
