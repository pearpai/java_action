package com.action.jdxchxjs.ch02.deadLockTest;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class DealThread implements Runnable {

    public String userName;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String userName){
        this.userName = userName;
    }


    @Override
    public void run() {
        if (userName.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("userName = " + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按 lock1->lock2 代码顺序执行了 ");
                }
            }
        }
        if (userName.equals("b")){
            synchronized (lock2){
                try {
                    System.out.println("username = " + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按 lock2->lock1 代码顺序执行了 ");
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);


            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}



