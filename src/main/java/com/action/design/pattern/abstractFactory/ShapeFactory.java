package com.action.design.pattern.abstractFactory;


/**
 * Created by wuyunfeng on 2017/6/13.
 */
@SuppressWarnings("ALL")
public class ShapeFactory extends AbstractFactory {
    Color getColor(String color) {
        return null;
    }

    Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
