package com.action.threads.bfbcsz.chapter3;

/**
 * Created by wuyunfeng on 2017/6/28.
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println(1111);
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new ReaderThread().start();
            number = 42;
            ready = true;
        }

    }
}
