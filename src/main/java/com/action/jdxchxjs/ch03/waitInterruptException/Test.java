package com.action.jdxchxjs.ch03.waitInterruptException;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
