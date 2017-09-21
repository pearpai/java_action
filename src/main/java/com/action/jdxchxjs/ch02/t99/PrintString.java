package com.action.jdxchxjs.ch02.t99;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class PrintString implements Runnable {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStringMethod threadName="
                        + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        printStringMethod();
    }

    public static void main(String[] args) {
//        PrintString printStringService = new PrintString();
//        printStringService.printStringMethod();
//        System.out.println(" 我要停止他！ stopThread=" + Thread.currentThread().getName());
//        printStringService.setContinuePrint(false);


        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println(" 我要停止他！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);

    }


}
