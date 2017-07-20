package com.action.threads.bfbcsz.chapter7;

import com.action.threads.bfbcsz.LaunderThrowable;

import java.util.concurrent.*;

/**
 * Created by wuyunfeng on 2017/7/4.
 */
public class TimedRun2 {

    private static final ExecutorService taskExec = Executors.newCachedThreadPool();

    public static void timeRun(Runnable r, long timeout, TimeUnit unit) throws TimeoutException {
        Future<?> task = taskExec.submit(r);

        try {
            task.get(timeout, unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
            throw LaunderThrowable.launderThrowable(e);

        }
    }

}
