package com.action.design.pattern.builder;

import com.action.design.pattern.builder.packing.Wrapper;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
