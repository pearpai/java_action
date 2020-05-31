package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:04
 * @Version 1.0
 */
public abstract class SchoolReport {

    // 成绩单主要展示的就是你都成绩状况
    public abstract void report();

    // 成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);

}
