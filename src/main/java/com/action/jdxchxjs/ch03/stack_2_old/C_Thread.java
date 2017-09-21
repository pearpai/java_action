package com.action.jdxchxjs.ch03.stack_2_old;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class C_Thread extends Thread{

    private C c;

    public C_Thread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.popService();
        }
    }
}
