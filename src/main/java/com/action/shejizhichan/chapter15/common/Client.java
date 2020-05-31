package com.action.shejizhichan.chapter15.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 10:43
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();

    }

}
