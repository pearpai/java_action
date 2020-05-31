package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:19
 * @Version 1.0
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FourthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);



        sr.report();
        sr.sign("老三");

    }

}
