package com.action.jdxchxjs.ch02.t3;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA thread = new ThreadA(publicVar);
            thread.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
