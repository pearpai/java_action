package com.action.netty2.chapter1;

import java.util.concurrent.TimeUnit;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 12. 5月 2020 5:53 下午
 */
public class Shutdown1 {

    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new java.lang.Thread(() -> {
            System.out.println("ShoutdownHook execute start...");
            System.out.println("Netty NioEventLoopGroup shutdownGracefully...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ShutdownHook execute end...");
        }, "shutdown"));
        TimeUnit.SECONDS.sleep(7);
        System.exit(0);
    }

}
