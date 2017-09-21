package com.action.jdxchxjs.ch03.test1;

/**
 * 对象加同步锁
 * Created by wuyunfeng on 2017/9/21.
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn 上面");
            synchronized (lock) {
                System.out.println("syn 第一行");
                String newString = new String("");
                newString.wait();
                System.out.println("syn 下面的代码");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
