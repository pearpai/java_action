package com.action.threads.bfbcsz.chapter3;

/**
 * Created by wuyunfeng on 2017/6/28.
 */
public class SynchronizedInteger {

    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }


    public static void main(String[] args) {
        SynchronizedInteger integer = new SynchronizedInteger();

        new Thread(() -> integer.setValue(100)).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(111);
        new Thread(() -> System.out.println(integer.getValue())).start();


    }
}
