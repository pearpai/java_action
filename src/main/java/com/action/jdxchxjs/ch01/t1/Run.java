package com.action.jdxchxjs.ch01.t1;

/**
 * Created by wuyunfeng on 2017/9/18.
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }

}
