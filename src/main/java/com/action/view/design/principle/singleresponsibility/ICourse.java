package com.action.view.design.principle.singleresponsibility;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:04
 * @Version 1.0
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();

}
