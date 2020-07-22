package com.guoquan.action.thread;

import java.util.concurrent.Semaphore;

/**
 * 信号量处理
 *
 * @Author wuyunfeng
 * @Date 2020/7/16 17:32
 */
public class T1114_2 {

    private Semaphore semaphore1 = new Semaphore(0);
    private Semaphore semaphore2 = new Semaphore(0);

    public T1114_2() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphore1.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        semaphore2.release();

    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphore2.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


    public static void main(String[] args) throws InterruptedException {
        Runnable a = () -> System.out.println(1);
        Runnable b = () -> System.out.println(2);
        Runnable c = () -> System.out.println(3);

        T1114_2 t = new T1114_2();

        t.first(a);
        t.second(b);
        t.third(c);


    }

}
