package com.action.gaobingfachenxusheji.chapter02;

import java.util.concurrent.TimeUnit;

public class DaemonDemo {

    public static class DaemonT extends Thread {
        public void run() {
            while (true) {
                System.out.println("I am alive");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new DaemonT();
        t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
    }

}
