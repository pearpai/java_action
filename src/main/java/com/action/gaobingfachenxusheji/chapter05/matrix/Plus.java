package com.action.gaobingfachenxusheji.chapter05.matrix;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Plus implements Runnable {

    public static BlockingQueue<Msg> bq = new LinkedBlockingQueue<>();


    @Override
    public void run() {
        while (true){
            try {
                Msg msg = bq.take();
                msg.j = msg.i + msg.j;
                Multiply.bq.add(msg);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
