package com.action.threads.bfbcsz.chapter7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public class PrimeGenerator extends Thread implements Runnable{

    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean cancelled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while (!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        cancelled = true;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<>(primes);
    }


    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeGenerator();
        generator.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generator.cancel();
        generator.get().forEach(System.out::println);

    }
}
