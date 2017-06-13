package com.action.design.pattern.builder;

/**
 * 继承 Burger类 因为Burger 都是有相同的包装方式
 * Created by wuyunfeng on 2017/6/13.
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25.0f;
    }
}
