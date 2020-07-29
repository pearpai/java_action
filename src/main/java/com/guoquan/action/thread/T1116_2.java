package com.guoquan.action.thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 假设有这么一个类：
 * <p>
 * class ZeroEvenOdd {
 *   public ZeroEvenOdd(int n) { ... }      // 构造函数
 * public void zero(printNumber) { ... }  // 仅打印出 0
 * public void even(printNumber) { ... }  // 仅打印出 偶数
 * public void odd(printNumber) { ... }   // 仅打印出 奇数
 * }
 * 相同的一个 ZeroEvenOdd 类实例将会传递给三个不同的线程：
 * <p>
 * 线程 A 将调用 zero()，它只输出 0 。
 * 线程 B 将调用 even()，它只输出偶数。
 * 线程 C 将调用 odd()，它只输出奇数。
 * 每个线程都有一个 printNumber 方法来输出一个整数。请修改给出的代码以输出整数序列 010203040506... ，其中序列的长度必须为 2n。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出："0102"
 * 说明：三条线程异步执行，其中一个调用 zero()，另一个线程调用 even()，最后一个线程调用odd()。正确的输出为 "0102"。
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出："0102030405"
 */
public class T1116_2 {


    private int n;

    volatile int flag = 0;


    public T1116_2(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag > 0) {
            }
            printNumber.accept(0);
            if (i % 2 == 1) {
                flag = 2;
            } else {
                flag = 1;
            }
        }


    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i+=2) {
            while (flag != 2){}
            printNumber.accept(i);
            flag = 0;
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            while (flag != 1){}
            printNumber.accept(i);
            flag = 0;
        }
    }


    public static void main(String[] args) {
//        start(e -> System.out.print("Release year: " + e), 2013);

        T1116_2 t1116 = new T1116_2(2);

        new Thread(() -> {
            try {
                t1116.zero(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                t1116.even(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                t1116.odd(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }

    public static void start(IntConsumer cons, int d) {
        cons.andThen((e) -> System.out.print("-------" + e + "==")).andThen((e) -> System.out.print("++++++")).accept(d);
//        cons.accept(d);
    }
}
