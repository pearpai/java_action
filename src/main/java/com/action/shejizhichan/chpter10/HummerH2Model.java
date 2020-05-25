package com.action.shejizhichan.chpter10;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 13:16
 * @Version 1.0
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

}
