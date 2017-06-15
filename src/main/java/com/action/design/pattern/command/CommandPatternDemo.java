package com.action.design.pattern.command;

/**
 * 使用Broker类来接受并执行命令
 * Created by wuyunfeng on 2017/6/15.
 */
public class CommandPatternDemo {


    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);

        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}
