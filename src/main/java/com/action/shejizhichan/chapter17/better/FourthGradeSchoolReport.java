package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:06
 * @Version 1.0
 */
public class FourthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        // 成绩单格式样子
        System.out.println("尊敬都XXX家长：");
        System.out.println("......");
        System.out.println(" 语文62  数学  65...");
        System.out.println("......");
        System.out.println("           家长签名：    ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名： " + name);
    }
}
