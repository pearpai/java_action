package com.action.threads.bfbcsz.chapter2;

/**

 * Created by wuyunfeng on 2017/6/28.
 */
public class LoggingWidget extends Widget {
    public synchronized void doSomething(){
        System.out.println(toString() + ": calling doSomething");
        super.doSomething();
    }

    public static void main(String[] args) {
        new LoggingWidget().doSomething();

    }
}
