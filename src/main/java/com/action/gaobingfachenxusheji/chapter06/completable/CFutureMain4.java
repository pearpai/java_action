package com.action.gaobingfachenxusheji.chapter06.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFutureMain4 {

    public static Integer calc(Integer para) {
        try {
            // 模拟一个较长的执行时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return para / 0;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final CompletableFuture<Void> fu =
                CompletableFuture.supplyAsync(() -> calc(50))
                        .exceptionally(ex->{
                            System.out.println(ex.toString());
                            return 0;
                        })
                        .thenApply((i) -> Integer.toString(i))
                        .thenApply((str) -> "\"" + str + "\"")
                        .thenAccept(System.out::println);

        // 声明中已经执行了fu 只是 在ForkJoinPool.commonPool中的 守护线程
        fu.get();

//        Thread.sleep(2000);
    }

}
