package com.action.jdxchxjs.ch03.wait_notify_size5;

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
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("通知已经发出");
                    }
                    System.out.println("添加 " + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
