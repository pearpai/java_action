package com.action.netty2.chapter1;

import sun.misc.Signal;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * "SIGINT handler" - Thread t@24
 * java.lang.Thread.State: TIMED_WAITING
 * at java.lang.Thread.sleep(Native Method)
 * at java.lang.Thread.sleep(Thread.java:340)
 * at java.util.concurrent.TimeUnit.sleep(TimeUnit.java:386)
 * at com.action.netty2.chapter1.SignalHandlerTest.lambda$main$0(SignalHandlerTest.java:20)
 * at com.action.netty2.chapter1.SignalHandlerTest$$Lambda$1/1207140081.handle(Unknown Source)
 * at sun.misc.Signal$1.run(Signal.java:212)
 * at java.lang.Thread.run(Thread.java:748)
 * <p>
 * Locked ownable synchronizers:
 * - None
 * @Author wuyunfeng
 * @Date 2020-05-12 21:35
 * @Version 1.0
 */
public class SignalHandlerTest {

    public static void main(String[] args) {
        Signal sig = new Signal("INT");
        Signal.handle(sig, (s) -> {
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

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Daemon-T").start();

    }


}
