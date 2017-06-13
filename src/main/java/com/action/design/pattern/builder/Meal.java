package com.action.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 * Created by wuyunfeng on 2017/6/13.
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    private Float cost = 0.0f;

    public void addItem(Item item) {
        items.add(item);
    }


    public float getCost() {
        items.forEach(item -> cost += item.price());
        return cost;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print(" Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.print(", Price: " + item.price());
            System.out.println();
        });
    }


}
