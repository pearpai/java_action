package com.action.view.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:30
 * @Version 1.0
 */
public class TeamLeader {

    public void checkNumberOfCourses() {

        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        System.out.println("在线课程的数量是：" + courseList.size());
    }

}
