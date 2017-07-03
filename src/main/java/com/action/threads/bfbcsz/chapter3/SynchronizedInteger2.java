package com.action.threads.bfbcsz.chapter3;

/**
 * Created by wuyunfeng on 2017/6/28.
 */
public class SynchronizedInteger2 {

//    private static int value;

    public static synchronized int getValue() {
        System.out.println("xxxxx");
        return 1222;
    }

    public static synchronized void setValue(int xxx) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        getValue();
        System.out.println("yyyy");
    }


    public static void main(String[] args) {

        new Thread(() -> SynchronizedInteger2.setValue(100)).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(111);
        new Thread(() -> System.out.println(1111111)).start();

    }
}
