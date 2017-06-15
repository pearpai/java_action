package com.action.design.pattern.abstractFactory;

/**
 * Color Image 对象创建抽象类 来获取工厂
 * Created by wuyunfeng on 2017/6/13.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}
