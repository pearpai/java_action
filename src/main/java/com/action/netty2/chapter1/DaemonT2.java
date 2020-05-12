package com.action.netty2.chapter1;

import java.util.concurrent.TimeUnit;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 12. 5月 2020 5:00 下午
 */
public class DaemonT2 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        Runnable target;
        target = () -> {
            try {
                TimeUnit.DAYS.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t = new Thread(target, "Daemon-T");
//        t.setDaemon(true);
        t.setDaemon(false);
        t.start();
        TimeUnit.SECONDS.sleep(15);
        System.out.println("main线程退出，程序执行" + (System.nanoTime() - startTime) / 1000 / 1000 / 1000 + " s");
    }
}


