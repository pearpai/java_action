package com.action.view.design.principle.singleresponsibility;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 21:23
 * @Version 1.0
 */
public class Bird {

    public void mainMoveMode(String birdName) {

        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }

}
