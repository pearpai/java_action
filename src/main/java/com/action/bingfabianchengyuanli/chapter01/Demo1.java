package com.action.bingfabianchengyuanli.chapter01;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 11:15
 * @Version 1.0
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("main enter");

        Runnable target;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("t1 is executing");
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        System.out.println("main exit");

    }


}
