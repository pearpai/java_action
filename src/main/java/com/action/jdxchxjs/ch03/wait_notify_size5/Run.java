package com.action.jdxchxjs.ch03.wait_notify_size5;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();
        Thread.sleep(50);

        ThreadB b = new ThreadB(lock);

        b.start();

    }

}
