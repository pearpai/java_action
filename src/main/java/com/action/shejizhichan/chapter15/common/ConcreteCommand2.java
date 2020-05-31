package com.action.shejizhichan.chapter15.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 10:37
 * @Version 1.0
 */
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
