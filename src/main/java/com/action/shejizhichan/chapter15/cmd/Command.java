package com.action.shejizhichan.chapter15.cmd;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 10:00
 * @Version 1.0
 */
public abstract class Command {

    // 把三个组定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    // 只有一个方法，你需要我做什么事情
    public abstract void execute();
}
