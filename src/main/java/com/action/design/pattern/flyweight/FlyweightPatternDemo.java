package com.action.design.pattern.flyweight;

/**
 * 使用该工厂，通过传递颜色信息来获取实体类的对象。
 * Created by wuyunfeng on 2017/6/14.
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i){
            Circle circle = (Circle)ShapeFactory.getCirle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }

    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }

}
