package com.action.jdxchxjs.ch03.test1;

/**
 * 对象没有加同步锁
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test1 {

    public static void main(String[] args) {
        try {

            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
