package com.action.jdxchxjs.ch03.twoThreadTransData;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class ThreadA extends Thread {

private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i <10 ; i++) {
                list.add();
                System.out.println("添加了 " + (i+1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
