package com.action.jdxchxjs.ch03.notifyOne;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class NotifyThread extends Thread {

    private final Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }


    @Override
    public void run() {

        synchronized (lock){
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();

            lock.notifyAll();
        }

    }
}
