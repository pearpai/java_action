package com.action.design.pattern.builder;

import com.action.design.pattern.builder.packing.Bottle;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
