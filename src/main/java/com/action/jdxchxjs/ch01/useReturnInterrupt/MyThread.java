package com.action.jdxchxjs.ch01.useReturnInterrupt;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        super.run();

        try {
            while (true) {
                if (this.isInterrupted()) {
                    System.out.println("停止了！");
                    return;
                }
                System.out.println("timer=" + System.currentTimeMillis());
            }

        } catch (ThreadDeath death) {
            System.out.println("进入了catch()方法！");
            death.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {


            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
