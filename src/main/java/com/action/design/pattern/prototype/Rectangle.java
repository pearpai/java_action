package com.action.design.pattern.prototype;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        setType("Rectangle");
    }

    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}
