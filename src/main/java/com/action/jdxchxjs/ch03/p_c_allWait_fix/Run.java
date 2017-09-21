package com.action.jdxchxjs.ch03.p_c_allWait_fix;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");

        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] threadPS = new ThreadP[2];
        ThreadC[] threadCS = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            threadPS[i] = new ThreadP(p);
            threadPS[i].setName("生产者 " + (i + 1));
            threadCS[i] = new ThreadC(c);
            threadCS[i].setName("消费者 " + (i + 1));

            threadPS[i].start();
            threadCS[i].start();
        }

        Thread.sleep(5000);
        System.out.println();
        System.out.println();
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);

        for (Thread thread : threads) {
            System.out.println(thread.getName() + " " + thread.getState());
        }

    }

}
