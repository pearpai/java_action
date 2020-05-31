package com.action.shejizhichan.chapter15.cmd;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 9:34
 * @Version 1.0
 */
public abstract class Group {

    // 甲乙双方分开办公，如果你要和某个组讨论，你先要找到这个组
    public abstract void find();

    // 被要求增加功能
    public abstract void add();

    // 被要求修改功能
    public abstract void change();

    // 被要求删除功能
    public abstract void delete();

    // 被要求给出所有的变更计划
    public abstract void plan();

}
