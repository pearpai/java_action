package com.action.design.pattern.facade;

/**
 * 创建接口实现实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
