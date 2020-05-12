package com.action.netty2.chapter1;

import sun.misc.Signal;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-12 21:35
 * @Version 1.0
 */
public class SignalHandlerTest {

    public static void main(String[] args) {
        Signal sig = new Signal("INT");
        Signal.handle(sig, (s) ->{
            System.out.println("Signal handle start...");
            try {
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("ShutdownHook execute start...");
            System.out.println("Netty NioEventLoopGroup shutdownGracefully...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ShutdownHook execute end...");
        }));

        new Thread(() ->{
            try {
                TimeUnit.SECONDS.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }


}
