package com.action.jdxchxjs.ch03.notifyOne;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

        ThreadC c = new ThreadC(lock);
        c.start();


        NotifyThread notifyThread = new NotifyThread(lock);

        Thread.sleep(1000);

        notifyThread.start();
    }

}
