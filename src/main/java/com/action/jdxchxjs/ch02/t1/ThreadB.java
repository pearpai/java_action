package com.action.jdxchxjs.ch02.t1;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }


    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }

}
