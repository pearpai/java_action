package com.action.threads.demo1;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThead running");
    }
}
