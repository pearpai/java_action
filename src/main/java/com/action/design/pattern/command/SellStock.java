package com.action.design.pattern.command;

/**
 * 创建实现了 Order 接口的实体类。
 * Created by wuyunfeng on 2017/6/15.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void exectue() {
        abcStock.sell();
    }
}
