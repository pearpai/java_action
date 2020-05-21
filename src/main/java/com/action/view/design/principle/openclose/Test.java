package com.action.view.design.principle.openclose;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 20:39
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java-", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;

        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");

    }

}
