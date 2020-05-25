package com.action.shejizhichan.chapter07;

/**
 * @Description 皇帝类
 * @Author wuyunfeng
 * @Date 2020-05-23 18:58
 * @Version 1.0
 */
public class Emperor {
    // 初始化一个皇帝
    private static final Emperor emperor = new Emperor();

    private Emperor() {
        // 世俗和道德约束，目的就是不希望产生第二个皇帝
    }

    public static Emperor getInstance() {
        return emperor;
    }

    // 皇帝发话
    public static void say() {
        System.out.println("我就是皇帝某某某...");
    }
}
