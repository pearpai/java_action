package com.action.jdxchxjs.ch02.t1;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class HasSelfPrivateNum {

    public void addI(String userName){

        try {
            int num;
            if (userName.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num =200;
                System.out.println("b set over");
            }
            System.out.println(userName + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
