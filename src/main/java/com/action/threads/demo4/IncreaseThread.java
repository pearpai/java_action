package com.action.threads.demo4;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class IncreaseThread extends Thread {
    private NumberHolder numberHolder;

    public IncreaseThread(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; ++i){
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.increase();
        }
    }
}
