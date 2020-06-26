package com.action.gaobingfachenxusheji.chapter05.guava;

import com.action.gaobingfachenxusheji.chapter05.future.RealData;
import com.google.common.util.concurrent.*;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FutureDemo2 {

    public static void main(String[] args) throws InterruptedException {
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

        ListenableFuture<String> task = service.submit(new RealData("x"));

        Futures.addCallback(task, new FutureCallback<String>() {
            @Override
            public void onSuccess(@Nullable String s) {
                System.out.println("异步处理成功，result=" + s);
            }

            @Override
            public void onFailure(@NotNull Throwable throwable) {
                System.out.println("异步处理失败，e=" + throwable);
            }
        }, MoreExecutors.newDirectExecutorService());

//        task.addListener(() -> {
//            System.out.println("异步处理成功");
//            try {
//                System.out.println(task.get());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }, MoreExecutors.directExecutor());


        System.out.println("main task done...");
        TimeUnit.SECONDS.sleep(3);

        service.shutdown();

    }

}
