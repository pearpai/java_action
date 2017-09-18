package com.action.threads;

/**
 * Created by wuyunfeng on 2017/9/7.
 */
public class TestSync {


    static void doSth(A aClass) {
        synchronized (aClass) {
            if (aClass.a == 2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(aClass.a);
        }
    }


    public static void main(String[] args) {

        A a1 = new A();
        a1.a = 1;
        A a2 = new A();
        a2.a = 2;

        for (int i = 0; i <100 ; i++) {
            if (i % 2 == 0){
                new B(a2).start();
            }else {
                new B(a1).start();
            }
        }


    }


}
