package com.action.jdxchxjs.ch03.notifyOne;

/**
 * Created by wuyunfeng on 2017/9/21.
 */

public class Service {

    @SuppressWarnings("ALL")
    public void testMethod(Object lock){
        try {
            //noinspection SynchronizationOnLocalVariableOrMethodParameter
            synchronized (lock){
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() ThreadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
