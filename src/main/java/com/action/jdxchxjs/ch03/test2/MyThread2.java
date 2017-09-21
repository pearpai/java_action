package com.action.jdxchxjs.ch03.test2;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyThread2 extends Thread {

    private final Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }


    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始  notify  wait time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束  notify wait time=" + System.currentTimeMillis());
        }
    }
}
