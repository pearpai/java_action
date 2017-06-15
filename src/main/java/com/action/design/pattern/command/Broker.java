package com.action.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建命令调用类
 * Created by wuyunfeng on 2017/6/15.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();
    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.forEach(Order::exectue);
        orderList.clear();
    }

}
