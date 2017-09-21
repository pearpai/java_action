package com.action.jdxchxjs.ch01.stopThrowLock;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }


    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " "
                    + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
