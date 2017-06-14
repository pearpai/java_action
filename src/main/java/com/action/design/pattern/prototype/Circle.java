package com.action.design.pattern.prototype;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }


}
