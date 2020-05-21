package com.action.view.design.principle.demeter;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:32
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
