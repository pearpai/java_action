package com.action.view.design.principle.singleresponsibility;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 21:24
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");


        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        flyBird.mainMoveMode("鸵鸟");

    }

}
