package com.action.threads.demo4;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class NumberTest {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();

        Thread t1 = new IncreaseThread(numberHolder);
        Thread t2 = new DecreaseThread(numberHolder);

        t1.start();
        t2.start();

        Thread t3 = new IncreaseThread(numberHolder);
        Thread t4 = new DecreaseThread(numberHolder);

        t3.start();
        t4.start();
    }
}
