package com.action.view.design.principle.dependenceinversion;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 21:04
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely 在学习Java课程");
    }
}
