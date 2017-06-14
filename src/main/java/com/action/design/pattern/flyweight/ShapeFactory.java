package com.action.design.pattern.flyweight;

import java.util.HashMap;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * Created by wuyunfeng on 2017/6/14.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCirle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
