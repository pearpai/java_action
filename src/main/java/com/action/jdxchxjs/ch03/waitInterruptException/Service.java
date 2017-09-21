package com.action.jdxchxjs.ch03.waitInterruptException;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Service {

    public void testMethod(Object lock){

        try{
            //noinspection SynchronizationOnLocalVariableOrMethodParameter
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println(" end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
