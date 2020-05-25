package com.action.shejizhichan.chapter11;

import java.util.ArrayList;

/**
 * @Description 导演类
 * @Author wuyunfeng
 * @Date 2020-05-24 15:04
 * @Version 1.0
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABezModel() {
        // 清理场景，这里是程序员不注意到的地方
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }


    public BenzModel getBBezModel() {
        // 清理场景，这里是程序员不注意到的地方
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

}
