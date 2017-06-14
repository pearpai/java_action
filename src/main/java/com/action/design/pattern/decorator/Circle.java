package com.action.design.pattern.decorator;

/**
 * 接口实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
