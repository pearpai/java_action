package com.action.design.pattern.decorator;

/**
 * 使用 RedShapeDecorator 来装饰 Shape 对象。
 * Created by wuyunfeng on 2017/6/14.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
