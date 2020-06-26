package com.action.gaobingfachenxusheji.chapter05.guava;

import com.action.gaobingfachenxusheji.chapter05.future.RealData;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FutureDemo {

    public static void main(String[] args) throws InterruptedException {
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

        ListenableFuture<String> task = service.submit(new RealData("x"));

        task.addListener(() -> {
            System.out.println("异步处理成功");
            try {
                System.out.println(task.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, MoreExecutors.directExecutor());


        System.out.println("main task done...");
        TimeUnit.SECONDS.sleep(3);

        service.shutdown();

    }

}
