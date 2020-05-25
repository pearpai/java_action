package com.action.shejizhichan.chapter08.multfactory;

import com.action.shejizhichan.chapter08.BlackHuman;
import com.action.shejizhichan.chapter08.Human;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 9:20
 * @Version 1.0
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
