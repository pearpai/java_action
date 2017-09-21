package com.action.jdxchxjs.ch03.test2;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyThread1 extends Thread {

    private final Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }


    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始   wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束   wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
