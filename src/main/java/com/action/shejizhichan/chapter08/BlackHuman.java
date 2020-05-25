package com.action.shejizhichan.chapter08;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 8:10
 * @Version 1.0
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
