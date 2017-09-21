package com.action.jdxchxjs.ch01.useStopMethodThreadTest;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        super.run();

        try {
            while (true){
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ThreadDeath death){
            System.out.println("进入了catch()方法！");
            death.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {


            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
