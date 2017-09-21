package com.action.jdxchxjs.ch03.notifyHoldLock;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class SyncNotifyMethodThread extends Thread {

    private final Object lock;


    public SyncNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }


    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
