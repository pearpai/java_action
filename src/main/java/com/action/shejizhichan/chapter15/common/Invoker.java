package com.action.shejizhichan.chapter15.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 10:42
 * @Version 1.0
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}
