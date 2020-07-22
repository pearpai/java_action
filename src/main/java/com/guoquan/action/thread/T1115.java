package com.guoquan.action.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author wuyunfeng
 * @Date 2020/7/16 17:57
 */
public class T1115 {

    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(0);


    private int n;

    public T1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphore2.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore2.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphore1.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable a = () -> System.out.println(1);
        Runnable b = () -> System.out.println(2);

        T1115 fooBar = new T1115(3);


        Thread t1 = new Thread(()->{
            try {
                fooBar.foo(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                fooBar.bar(b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
        t1.start();

    }

}
