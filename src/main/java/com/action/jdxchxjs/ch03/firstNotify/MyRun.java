package com.action.jdxchxjs.ch03.firstNotify;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyRun {

    private final Object lock = new Object();

    private boolean isFirstRunB = false;

    private Runnable runnableA = () -> {
        try {
            synchronized (lock) {
                while (!isFirstRunB) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    private Runnable runnableB = () -> {
        synchronized (lock) {
            System.out.println("Begin notify");
            lock.notify();
            System.out.println("end notify");
            isFirstRunB = true;
        }
    };

    public static void main(String[] args) throws InterruptedException {
        // 正常流程
        MyRun run = new MyRun();
//
//        Thread a = new Thread(run.runnableA);
//        a.start();
//        Thread b = new Thread(run.runnableB);
//        b.start();

        // 通知过早
        Thread b = new Thread(run.runnableB);
        b.start();

        Thread.sleep(100);

        Thread a = new Thread(run.runnableA);
        a.start();

    }

}
