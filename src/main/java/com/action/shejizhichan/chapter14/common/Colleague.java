package com.action.shejizhichan.chapter14.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:57
 * @Version 1.0
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
