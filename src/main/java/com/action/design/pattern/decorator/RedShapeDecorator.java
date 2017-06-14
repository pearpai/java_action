package com.action.design.pattern.decorator;

/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 * Created by wuyunfeng on 2017/6/14.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShap) {
        super(decoratedShap);
    }

    @Override
    public void draw() {
        super.draw();
        setReadBorder(decoratedShap);
    }

    private void setReadBorder(Shape shape) {
        System.out.println("Border Color:red");
    }
}
