package com.action.design.pattern.prototype;


/**
 * 这个例子中没有不分浅复杂 还是 深复制  只有当 类中相关其他类的时候 如需深复制 这进行 相关类对象的clone
 * Created by wuyunfeng on 2017/6/13.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneShape2.getType());


        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneShape3.getType());


    }

}
