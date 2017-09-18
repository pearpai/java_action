package com.action.jdxchxjs.ch01.t13;

/**
 * Created by wuyunfeng on 2017/9/18.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了！我要退出");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }


    public static void main(String[] args)  {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
