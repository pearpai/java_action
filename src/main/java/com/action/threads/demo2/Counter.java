package com.action.threads.demo2;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class Counter {
    long count = 0;

    public synchronized void add(long value){
        this.count += value;
        System.out.println(count);
    }
}
