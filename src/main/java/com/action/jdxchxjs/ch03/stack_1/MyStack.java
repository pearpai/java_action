package com.action.jdxchxjs.ch03.stack_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyStack  {

    private List list = new ArrayList();

    public synchronized void pubsh(){

        try {
            if (list.size() == 1){
                this.wait();
            }
            list.add("anyString=" + Math.random());
            this.notify();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized String pop(){

        String returnValue = "";
        try {
            if (list.size() == 0){
                System.out.println("pop 操作中的：" + Thread.currentThread().getName()
                + " 线程呈wait状态");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    return returnValue;
    }


}
