package com.action.shejizhichan.chapter11;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 14:54
 * @Version 1.0
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
