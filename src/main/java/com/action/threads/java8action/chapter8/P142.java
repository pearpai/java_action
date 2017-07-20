package com.action.threads.java8action.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by wuyunfeng on 2017/7/20.
 */
public class P142 {

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
    }


    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n).reduce(0, Long::sum);
    }

    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }


    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            System.out.println("Result: " + sum);
            long duration = (System.nanoTime() - start) / 1_000_000;
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }


    public static class Accumulator {
        private long total = 0;

        public void add(long value) {
            total += value;
        }
    }

    public static long forkJoinSum(long n){
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }

    public static void main(String[] args) {
//        System.out.println("Sequential sum done in: " + measureSumPerf(P142::rangedSum, 10_000_000) + " msecs");

//        System.out.println("Sequential sum done in: " + measureSumPerf(P142::sequentialSum, 10_000_000) + " msecs");

//        System.out.println("Sequential sum done in: " + measureSumPerf(P142::parallelSum, 10_000_000) + " msecs");

//        System.out.println("Sequential sum done in: " + measureSumPerf(P142::sideEffectParallelSum, 10_000_000) + " msecs");

        System.out.println("forkJoinSum sum done in: " + measureSumPerf(P142::forkJoinSum, 10_000_000) + " msecs");
    }

}
