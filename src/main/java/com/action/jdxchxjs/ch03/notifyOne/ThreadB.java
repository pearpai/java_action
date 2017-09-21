package com.action.jdxchxjs.ch03.notifyOne;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadB extends Thread {

    private final Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
