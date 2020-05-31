package com.action.shejizhichan.chapter15.cmd;


/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 9:45
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 首先客户找到需求组说，过来谈需求，并修改

        Invoker invoker = new Invoker();
        System.out.println("-------客户要求增加一项需求-------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }

}
