package com.action.shejizhichan.chapter09;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 10:01
 * @Version 1.0
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是单字节。");
    }
}
