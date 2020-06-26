package com.action.gaobingfachenxusheji.chapter06.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFutureMain2 {

    public static Integer calc(Integer para){
        try {
            // 模拟一个较长的执行时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return para * para;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->calc(50));
        System.out.println(future.get());

    }

}
