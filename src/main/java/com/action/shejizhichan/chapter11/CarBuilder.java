package com.action.shejizhichan.chapter11;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 14:51
 * @Version 1.0
 */
public abstract class CarBuilder {

    // 建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    // 设置完毕顺序后，就可以直接拿到车辆的模型
    public abstract CarModel getCarModel();

}
