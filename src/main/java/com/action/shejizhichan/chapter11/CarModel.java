package com.action.shejizhichan.chapter11;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 14:37
 * @Version 1.0
 */
public abstract class CarModel {

    // 这个参数是各个基本方法执行顺序
    private ArrayList<String> sequence = new ArrayList<>();


    protected abstract void start();

    // 能发动，还要能停下来，那才是真本事
    protected abstract void stop();

    // 喇叭会出声，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    // 引擎会轰隆隆地响，不想那是假的
    protected abstract void engineBoom();


    final public void run() {
        for (String actionName : sequence) {
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equals("stop")) {
                this.stop();
            } else if (actionName.equals("alarm")) {
                this.alarm();
            } else if (actionName.equals("engine boom")) {
                this.engineBoom();
            }
        }
    }

    // 把传递过来的值传递到类内
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
