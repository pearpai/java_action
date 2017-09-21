package com.action.jdxchxjs.ch03.p_r_test;


/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class P {

    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue(){

        try {
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                ValueObject.value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set 的值是 " + ValueObject.value);
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
