package com.action.jdxchxjs.ch01.suspend_resume_test;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();

            thread.start();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());

            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());

            thread.resume();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
