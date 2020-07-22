package com.guoquan.action.thread;

/**
 * 原子性处理
 * @Author wuyunfeng
 * @Date 2020/7/16 17:32
 */
public class T1114 {

    private volatile int flag = 1;

    public T1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag != 2) {
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag = 3;

    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag != 3) {
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


    public static void main(String[] args) throws InterruptedException {
        Runnable a = () -> System.out.println(1);
        Runnable b = () -> System.out.println(2);
        Runnable c = () -> System.out.println(3);

        T1114 t = new T1114();

        t.first(a);
        t.second(b);
        t.third(c);


    }

}
