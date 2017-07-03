package com.action.threads.bfbcsz.chapter6;

import java.util.concurrent.Executor;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
//        new Thread(command).start();
        command.run();
    }
}
