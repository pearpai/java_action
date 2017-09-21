package com.action.jdxchxjs.ch02.innerTest1;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Run {

    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(inner::method1, "A");
        Thread t2 = new Thread(inner::method2, "B");
        t1.start();
        t2.start();
    }


}
