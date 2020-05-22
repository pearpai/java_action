package com.action.view.design.principle.liskovsubstitution;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 20:05
 * @Version 1.0
 */
public class Square implements Quadrangle {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }


}
