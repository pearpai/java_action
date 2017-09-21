package com.action.jdxchxjs.ch03.p_c_allWait;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadP  extends Thread{

private P p;

    public ThreadP(P p) {
        this.p = p;
    }


    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
