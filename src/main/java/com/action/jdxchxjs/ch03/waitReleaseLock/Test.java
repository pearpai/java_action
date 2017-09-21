package com.action.jdxchxjs.ch03.waitReleaseLock;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);

        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

    }

}
