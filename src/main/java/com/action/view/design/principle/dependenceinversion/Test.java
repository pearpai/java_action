package com.action.view.design.principle.dependenceinversion;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 21:01
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        v1
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//        geely.studyPythonCourse();

//        v2
//        Geely geely = new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());
//        geely.studyCourse(new PythonCourse());

//        v3
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyCourse();

//        v4
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();
    }

}
