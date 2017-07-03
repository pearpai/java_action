package com.action.threads.demo2;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
        }
    }
}

