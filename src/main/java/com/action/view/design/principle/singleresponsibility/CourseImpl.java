package com.action.view.design.principle.singleresponsibility;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:08
 * @Version 1.0
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
