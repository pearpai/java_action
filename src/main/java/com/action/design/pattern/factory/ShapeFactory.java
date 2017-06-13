package com.action.design.pattern.factory;

/**
 * 创建工厂
 * Created by wuyunfeng on 2017/6/13.
 */
@SuppressWarnings("ALL")
public class ShapeFactory {


    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;

    }


}
