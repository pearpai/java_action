package com.action.shejizhichan.chapter14.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:53
 * @Version 1.0
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        // 处理自己的业务
    }

    // 依赖方法
    public void depMethod1() {
        // 处理自己的业务逻辑
        // 处理自己不能处理的业务逻辑
        super.mediator.doSomething1();

    }
}
