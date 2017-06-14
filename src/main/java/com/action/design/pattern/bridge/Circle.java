package com.action.design.pattern.bridge;

/**
 * 创建实现了Shape接口的实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
