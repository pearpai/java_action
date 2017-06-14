package com.action.design.pattern.decorator;

/**
 * 创建实现了Shape接口的抽象装饰类
 * Created by wuyunfeng on 2017/6/14.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShap;

    public ShapeDecorator(Shape decoratedShap) {
        this.decoratedShap = decoratedShap;
    }

    @Override
    public void draw() {
        decoratedShap.draw();
    }
}
