package com.action.shejizhichan.chapter08.multfactory;

import com.action.shejizhichan.chapter08.Human;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 9:21
 * @Version 1.0
 */
public class NvWa {

    public static void main(String[] args) {
        // 女娲第一次造人，火候不足，于是白人产生
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}


