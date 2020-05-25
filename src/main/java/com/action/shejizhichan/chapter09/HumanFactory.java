package com.action.shejizhichan.chapter09;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 12:21
 * @Version 1.0
 */
public interface HumanFactory {

    // 制造一个黄色人种
    public Human createYellowHuman();

    // 制造一个白色人种
    public Human createWhiteHuman();

    // 制造一个黑色人种
    public Human createBlackHuman();
}
