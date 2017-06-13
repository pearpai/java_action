package com.action.design.pattern.abstractFactory;

/**
 * 颜色工厂
 * Created by wuyunfeng on 2017/6/13.
 */
public class ColorFactory extends AbstractFactory {

    Color getColor(String color) {
        if (color == null)
            return null;

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    Shape getShape(String shape) {
        return null;
    }
}
