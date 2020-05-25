package com.action.shejizhichan.chapter11;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 14:48
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benz.setSequence(sequence);
//        benz.run();


        CarBuilder benzBuilder = new BenzBuilder();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        benzBuilder.getCarModel().run();


        CarBuilder bmwBuilder = new BMWBuilder();

        bmwBuilder.setSequence(sequence);
        bmwBuilder.getCarModel().run();


    }
}
