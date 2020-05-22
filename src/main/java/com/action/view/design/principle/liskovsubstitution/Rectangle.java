package com.action.view.design.principle.liskovsubstitution;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 20:04
 * @Version 1.0
 */
public class Rectangle implements Quadrangle {

    private long length;
    private long width;


    public void setLength(long length) {
        this.length = length;
    }


    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
