package com.action.design.pattern.prototype;

import java.util.Hashtable;

/**
 * 创建一个类，从数据库获取实体类，并把他们存储在一个HashTable中
 * Created by wuyunfeng on 2017/6/13.
 */
public class ShapeCache {


    // demo 用的是hashTable之前一直没用用过 在此用一下(网速太差 没有网上确认 印象中 hashtable 是线程安全的
    // hashMap 不是线程安全 hashMap优化多一点接口多一点)
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }


    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");

        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
