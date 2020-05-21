package com.action.view.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:29
 * @Version 1.0
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkNumberOfCourses();
    }

}
