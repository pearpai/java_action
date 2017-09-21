package com.action.jdxchxjs.ch03.notifyHoldLock;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test {

    public static void main(String[] args) {
        Object lock = new Object();

        ThreadA a = new ThreadA(lock);

        a.start();


        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

        SyncNotifyMethodThread c = new SyncNotifyMethodThread(lock);
        c.start();
    }

}
