package com.action.threads.bfbcsz.chapter2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wuyunfeng on 2017/6/28.
 */
public class AtomicLongTest {

    private static final AtomicLong count = new AtomicLong();

    public static void main(String[] args) {
        count.incrementAndGet();
        System.out.println(count.get());

        Runnable runnable1 = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("runnable1----: " + count.incrementAndGet());
            }
        };


        Runnable runnable2 = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("runnable2====: " + count.incrementAndGet());
            }
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("thread====: " + count.incrementAndGet());
            }
        });

        thread.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("thread2-------: " + count.incrementAndGet());
            }
        });

        thread2.start();
    }

}

