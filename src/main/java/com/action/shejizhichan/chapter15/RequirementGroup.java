package com.action.shejizhichan.chapter15;

/**
 * @Description 需求组
 * @Author wuyunfeng
 * @Date 2020-05-25 9:37
 * @Version 1.0
 */
public class RequirementGroup extends Group {
    // 客户要求需求组过去和他们谈
    @Override
    public void find() {
        System.out.println("找到需求组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求变更计划...");
    }
}
