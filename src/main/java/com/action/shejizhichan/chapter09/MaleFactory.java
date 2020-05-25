package com.action.shejizhichan.chapter09;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 12:24
 * @Version 1.0
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
