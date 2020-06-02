package com.action.gaobingfachenxusheji.chapter03;

import com.google.common.util.concurrent.RateLimiter;

public class RateLimiterDemo {

    static RateLimiter limiter = RateLimiter.create(2);

    public static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        // 获取不到令牌会一直等下去
//        for (int i = 0; i < 50; i++) {
//            limiter.acquire();
//            new Thread(new Task()).start();
//        }

        // 只能输出一次 相当于500毫秒内只能申请到一个令牌
        for (int i = 0; i < 50; i++) {
            if (limiter.tryAcquire()) {
                new Thread(new Task()).start();
            }
        }

    }

}
