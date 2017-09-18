package com.action.jdxchxjs.ch01.t1;

/**
 * Created by wuyunfeng on 2017/9/18.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
