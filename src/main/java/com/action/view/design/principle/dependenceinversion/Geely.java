package com.action.view.design.principle.dependenceinversion;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 21:00
 * @Version 1.0
 */
public class Geely {

//    public void studyJavaCourse() {
//        System.out.println("Geely 在学习Java课程");
//
//    }
//
//    public void studyFECourse() {
//        System.out.println("Geely 在学习前端课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Geely 在学习Python课程");
//    }

    private ICourse iCourse;

    public Geely(ICourse iCourse) {

        this.iCourse = iCourse;

    }

    public Geely() {
    }

    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }



    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
