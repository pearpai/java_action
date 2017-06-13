package com.action.design.pattern.factory;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle 对象，并调用daw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // 获取Circle 对象，并调用daw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // 获取Circle 对象，并调用daw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }

}
