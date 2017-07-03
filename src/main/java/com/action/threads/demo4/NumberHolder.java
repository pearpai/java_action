package com.action.threads.demo4;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class NumberHolder {

    private int number;

    public synchronized void increase(){
        while (0!= number){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(number);
        notify();
    }

    public synchronized void decrease(){
        while (0 == number){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println(number);
        notify();
    }

}
