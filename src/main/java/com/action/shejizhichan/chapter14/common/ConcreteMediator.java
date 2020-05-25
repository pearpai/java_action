package com.action.shejizhichan.chapter14.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:57
 * @Version 1.0
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
