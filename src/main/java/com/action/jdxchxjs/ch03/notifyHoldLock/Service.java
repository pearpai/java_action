package com.action.jdxchxjs.ch03.notifyHoldLock;


/**
 * notify 被执行后 不释放锁 如果有多个 notify 先执行 notify
 * Created by wuyunfeng on 2017/9/21.
 */
public class Service {

    public void testMethod(Object lock) {

        try {
            //noinspection SynchronizationOnLocalVariableOrMethodParameter
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() ThreadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){

        try {
            //noinspection SynchronizationOnLocalVariableOrMethodParameter
            synchronized (lock){
                System.out.println("begin notify() ThreadName="+
                        Thread.currentThread().getName() + " time="+
                System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("  end notify() ThreadName="+
                        Thread.currentThread().getName() + " time="+
                        System.currentTimeMillis());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
