package com.action.jdxchxjs.ch02.synchronizedMethodLockObject;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class ThreadB extends Thread{
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
