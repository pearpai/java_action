package com.action.threads.demo2;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class Demo2 {


    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }

}
