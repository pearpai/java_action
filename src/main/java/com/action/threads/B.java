package com.action.threads;

/**
 * Created by wuyunfeng on 2017/9/7.
 */
public class B extends Thread {
    A aClass;

    public B(A aClass) {
        this.aClass = aClass;
    }

    @Override
    public void run() {
        TestSync.doSth(aClass);
    }
}
