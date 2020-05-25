package com.action.shejizhichan.chapter14.zhongjiezhe;

/**
 * @Description 抽象同事类
 * @Author wuyunfeng
 * @Date 2020-05-25 8:42
 * @Version 1.0
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
