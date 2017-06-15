package com.action.design.pattern.command;

/**
 * 创建实现了Order接口实体类
 * Created by wuyunfeng on 2017/6/15.
 */
public class BuyStock implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void exectue() {
        abcStock.buy();
    }
}
