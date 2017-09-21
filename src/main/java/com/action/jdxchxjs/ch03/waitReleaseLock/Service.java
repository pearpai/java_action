package com.action.jdxchxjs.ch03.waitReleaseLock;

/**
 * wait() 释放锁
 * Created by wuyunfeng on 2017/9/21.
 */
public class Service {

    @SuppressWarnings("SynchronizationOnLocalVariableOrMethodParameter")
    public void testMethod(Object lock){

        try {
            synchronized (lock){
                System.out.println("begin wait()");
                Thread.sleep(1000);
//                lock.wait();
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
