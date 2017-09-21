package com.action.jdxchxjs.ch03.waitReleaseLock;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadA extends Thread {

    private final Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
