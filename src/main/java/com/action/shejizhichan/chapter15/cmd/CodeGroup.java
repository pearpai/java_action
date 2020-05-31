package com.action.shejizhichan.chapter15.cmd;

/**
 * @Description 代码组
 * @Author wuyunfeng
 * @Date 2020-05-25 9:37
 * @Version 1.0
 */
public class CodeGroup extends Group {
    // 客户要求美工组过去和他们谈
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项代码功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
