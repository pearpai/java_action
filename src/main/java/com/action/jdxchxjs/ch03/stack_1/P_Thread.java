package com.action.jdxchxjs.ch03.stack_1;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class P_Thread extends Thread{

    private P p;

    public P_Thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
