package com.action.shejizhichan.chapter08;

/**
 * @Description 抽象人类创建工厂
 * @Author wuyunfeng
 * @Date 2020-05-24 8:17
 * @Version 1.0
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

}
