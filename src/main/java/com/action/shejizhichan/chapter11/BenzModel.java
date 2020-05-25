package com.action.shejizhichan.chapter11;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 14:45
 * @Version 1.0
 */
public class BenzModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车该这个样子停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭的声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎是这个声音的...");
    }
}
