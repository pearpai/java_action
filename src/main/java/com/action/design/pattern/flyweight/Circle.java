package com.action.design.pattern.flyweight;

import lombok.Data;

/**
 * 创建实现接口的实体类。
 * Created by wuyunfeng on 2017/6/14.
 */
@Data
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }

}
