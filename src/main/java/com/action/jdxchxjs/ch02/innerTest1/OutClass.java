package com.action.jdxchxjs.ch02.innerTest1;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class OutClass {

    static class Inner {
        public void method1() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
