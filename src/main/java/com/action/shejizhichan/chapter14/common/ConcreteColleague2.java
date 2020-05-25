package com.action.shejizhichan.chapter14.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:53
 * @Version 1.0
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        // 处理自己的业务
    }

    // 依赖方法
    public void depMethod2() {
        // 处理自己的业务逻辑
        // 处理自己不能处理的业务逻辑
        super.mediator.doSomething2();

    }
}
