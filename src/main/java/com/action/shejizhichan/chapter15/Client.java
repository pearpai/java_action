package com.action.shejizhichan.chapter15;


/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 9:45
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-------客户要求增加一项需求-------");
        Group rg = new RequirementGroup();
        // 找到需求组
        rg.find();
        // 增加一个需求
        rg.add();
        // 需求变更计划
        rg.plan();
    }

}
