package com.action.jdxchxjs.ch02.t1;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA aThread = new ThreadA(numRef);
        aThread.start();

        ThreadB bThread = new ThreadB(numRef);
        bThread.start();
    }

}
