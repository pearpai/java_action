package com.action.threads.demo1;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("MyRunnable running  name: " + threadName);
    }
}
