package com.action.jdxchxjs.ch02.synchronizedMethodLockObject2;

/**
 *
 * Created by wuyunfeng on 2017/9/19.
 */
public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);

        a.setName("A");
        b.setName("B");

        a.start();
        b.start();
    }

}
