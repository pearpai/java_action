package com.action.shejizhichan.chapter08;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 8:10
 * @Version 1.0
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人会说话，一般说的都是双字节。");
    }
}
