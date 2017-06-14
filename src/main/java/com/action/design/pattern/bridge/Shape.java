package com.action.design.pattern.bridge;

/**
 * 使用DrawAPI接口创建抽象类
 * Created by wuyunfeng on 2017/6/14.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


}
