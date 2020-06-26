package com.action.qianfeng.suanfa;

import java.util.concurrent.atomic.AtomicInteger;

public class TestS {

    private static final ThreadLocal<String> threadString = new ThreadLocal<>();
    private static final ThreadLocal<String> threadString2 = new ThreadLocal<>();

    public static void main(String[] args) {

//        System.out.println(threadString.get());

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                threadString.set("aaa");
                System.out.println("------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadString.get());
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                threadString.set("ad");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadString.get());
            }
        });

        a.start();
        b.start();

        AtomicInteger integer = new AtomicInteger(10);
        integer.incrementAndGet();
    }


}
