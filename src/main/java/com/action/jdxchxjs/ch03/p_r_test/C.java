package com.action.jdxchxjs.ch03.p_r_test;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }


    public void getValue(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值时 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
