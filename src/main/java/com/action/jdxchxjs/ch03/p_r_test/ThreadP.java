package com.action.jdxchxjs.ch03.p_r_test;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
