package com.action.jdxchxjs.ch01.t15;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();

        System.out.println("end");

    }
}
