package com.action.design.pattern.prototype;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    void draw() {
        System.out.println("Inside Square::draw() method.");
    }


}
