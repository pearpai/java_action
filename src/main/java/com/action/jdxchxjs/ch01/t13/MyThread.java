package com.action.jdxchxjs.ch01.t13;

/**
 * Created by wuyunfeng on 2017/9/18.
 */
public class MyThread extends Thread {

//    @Override
//    public void run() {
//        super.run();
//        for (int i = 0; i < 500000; i++) {
//            if (this.interrupted()) {
//                System.out.println("已经是停止状态了！我要退出");
////                throw new InterruptedException();
//                break;
//            }
//            System.out.println("i=" + (i + 1));
//        }
//        System.out.println("我被偷偷输出，如果此代码是for又继续运行，线程并未停止！");
//    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了！我要退出");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("进入MyThread.java类run方法中的catch了");
            e.printStackTrace();
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
