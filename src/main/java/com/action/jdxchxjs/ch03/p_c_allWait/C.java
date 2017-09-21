package com.action.jdxchxjs.ch03.p_c_allWait;

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
                while (ValueObject.value.equals("")){
                    System.out.println("消费者 " +
                    Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
