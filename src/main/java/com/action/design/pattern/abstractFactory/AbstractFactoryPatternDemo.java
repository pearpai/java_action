package com.action.design.pattern.abstractFactory;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class AbstractFactoryPatternDemo {


    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // 获取形状为Circle 对象 并调用draw 方法
        assert shapeFactory != null;
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // 获取形状为 RECTANGLE 对象 并调用draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // 获取形状为 RECTANGLE 对象 并调用draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // ##############################
        System.out.println();
        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        assert colorFactory != null;
        // 获取颜色类 RED 并调用fill方法
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        // 获取颜色类 Green 并调用fill方法
        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        // 获取颜色类 BLUE 并调用fill方法
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();



    }

}
