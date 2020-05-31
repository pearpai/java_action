package com.action.shejizhichan.chapter15;

/**
 * @Description 美工组
 * @Author wuyunfeng
 * @Date 2020-05-25 9:37
 * @Version 1.0
 */
public class PageGroup extends Group {
    // 客户要求美工组过去和他们谈
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项页面...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
