package com.action.jdxchxjs.ch02.synchronizedMethodLockObject;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyObject {

    public synchronized void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
