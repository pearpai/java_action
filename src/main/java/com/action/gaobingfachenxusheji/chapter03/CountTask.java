package com.action.gaobingfachenxusheji.chapter03;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Long> {

    private static final int THRESHOLD = 10000;

    private long start;
    private long end;

    public CountTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long sum = 0;
        boolean canCompute = (end - start) < THRESHOLD;
        if (canCompute) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("sum----------->" + sum);
        } else {
            // 分成100个小任务
//            long step = (start + end)/100;
            long step = (end - start) / 100;
            System.out.println("step is ---->===>>" + step);
            ArrayList<CountTask> subTasks = new ArrayList<>();
            long pos = start;
            for (int i = 0; i < 100; i++) {
                System.out.println("pos --->" + pos);
                long lastone = pos + step;
                if (lastone > end) lastone = end;
                CountTask subTask = new CountTask(pos, lastone);
                pos += step + 1;
                subTasks.add(subTask);
                subTask.fork();
            }

            for (CountTask t : subTasks) {
                sum += t.join();
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask task = new CountTask(0, 200000L);
        ForkJoinTask<Long> result = forkJoinPool.submit(task);

        try {
            long res = result.get();
            System.out.println("sum=" + res);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
