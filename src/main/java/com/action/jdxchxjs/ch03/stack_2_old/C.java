package com.action.jdxchxjs.ch03.stack_2_old;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){

        System.out.println("pop=" + myStack.pop());

    }
}
