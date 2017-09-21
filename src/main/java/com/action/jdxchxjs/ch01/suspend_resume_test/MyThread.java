package com.action.jdxchxjs.ch01.suspend_resume_test;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }


}
