package com.action.jdxchxjs.ch03.waitHasParamMethod;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyRunnable {

    static private final Object lock = new Object();

    static private Runnable runnable1 = () -> {
        try {
            synchronized (lock) {
                System.out.println("wait begin timer=" + System.currentTimeMillis());
                lock.wait(5000);
                System.out.println("wait    end timer=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    static private Runnable runnable2 = () -> {

        synchronized (lock) {
            System.out.println("notify begin timer=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("notify    end timer=" + System.currentTimeMillis());
        }

    };


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable1);
        t.start();

        Thread.sleep(3000);

        Thread t2 = new Thread(runnable2);
        t2.start();
    }


}
