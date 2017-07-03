package com.action.threads.demo3;

/**
 * Created by wuyunfeng on 2017/6/26.
 */
public class MyWaitNotify {

    MonitorObject monitorObject = new MonitorObject();

    public void doWait(){
        synchronized (monitorObject){
            try {
                monitorObject.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void doNotify(){
        synchronized (monitorObject){
            monitorObject.notify();
        }
    }

}
