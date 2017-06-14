package com.action.design.pattern.bridge;

/**
 * 使用Shape 和 DrawAPI 画出不同颜色的圆
 * Created by wuyunfeng on 2017/6/14.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
