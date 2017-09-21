package com.action.jdxchxjs.ch03.p_c_allWait_fix;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }


    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }
}
