package com.action.design.pattern.facade;

/**
 * 使用该外观类画出各种类型的形状
 * Created by wuyunfeng on 2017/6/14.
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
