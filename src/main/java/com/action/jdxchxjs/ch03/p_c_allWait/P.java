package com.action.jdxchxjs.ch03.p_c_allWait;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class P {

    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {

        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + "WAITING☆");
                    lock.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + "RUNNABLE了");
                ValueObject.value = System.currentTimeMillis() + "_" + System.nanoTime();
                lock.notify();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
