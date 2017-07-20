package com.action.threads.bfbcsz.chapter7;

import java.math.BigInteger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public class PrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;


    public PrimeProducer(BlockingQueue<BigInteger> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!Thread.currentThread().isInterrupted())
                queue.put(p = p.nextProbablePrime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancel(){
        interrupt();
    }

    public static void main(String[] args) {

        BlockingQueue<BigInteger> queue = new ArrayBlockingQueue<>(100000);
        PrimeProducer primeProducer = new PrimeProducer(queue);
        primeProducer.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        primeProducer.cancel();


    }
}
