package com.action.jdxchxjs.ch03.twoThreadTransData;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Test {

    public static void main(String[] args) {
        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);

        b.setName("B");
        b.start();
    }

}
