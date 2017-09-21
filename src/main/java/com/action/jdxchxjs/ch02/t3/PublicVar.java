package com.action.jdxchxjs.ch02.t3;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class PublicVar {

    public String userName = "A";
    public String password = "AA";

    public synchronized void setValue(String userName, String password) {
        try {
            this.userName = userName;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username="
                    + userName + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getValue() {

        System.out.println("getValue method thread name="
                + Thread.currentThread().getName() + " userName=" + userName
                + " password=" + password);
    }

}
