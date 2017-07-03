package com.action.threads.demo1;

/**
 * 第一个多线程
 * Created by wuyunfeng on 2017/6/26.
 */
public class Demo1 {

    public static void main(String[] args) {
        // 没有可以执行的代码
        Thread thread = new Thread();
        thread.start();

        // 通过子类的一个实类重写run方法
        Thread myThead = new MyThread();
        myThead.start();

        // 通过创建Thread匿名子类 执行
        Thread thread1 = new Thread(() -> System.out.println("Thread running"));
//        Thread thread1 = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Thread running");
//            }
//        };
        thread1.start();

        // Runnable 接口实例
        Thread thread2 = new Thread(new MyRunnable(), "New Thread");
        thread2.start();

        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }

    }

}
