package com.action.shejizhichan.chapter14.zhongjiezhe;

/**
 * @Description 抽象中介者
 * @Author wuyunfeng
 * @Date 2020-05-25 8:26
 * @Version 1.0
 */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMediator() {

        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);

}
