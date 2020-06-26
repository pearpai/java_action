package com.action.gaobingfachenxusheji.chapter06.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderDemo {

    private static final int MAX_THREADS = 3;
    private static final int TASK_COUNT = 3;
    private static final int TARGET_COUNT = 10000000;

    private AtomicLong acount = new AtomicLong(0L);
    private LongAdder lacount = new LongAdder();

    private long count = 0;

    static CountDownLatch cdlsync = new CountDownLatch(TASK_COUNT);
    static CountDownLatch cdlatomic = new CountDownLatch(TASK_COUNT);
    static CountDownLatch cdladdr = new CountDownLatch(TASK_COUNT);

    protected synchronized long inc() {
        return ++count;
    }

    private synchronized long getCount() {
        return count;
    }

    public class SyncThread implements Runnable {
        protected String name;
        protected long starttime;
        LongAdderDemo out;

        public SyncThread(LongAdderDemo o, long starttime) {
            out = o;
            this.starttime = starttime;
        }

        @Override
        public void run() {
            long v = out.getCount();
            while (v < TARGET_COUNT) {
                v = out.inc();
            }

            long endTIme = System.currentTimeMillis();
            System.out.println("SyncThread spend:" + (endTIme - starttime) + "ms" + " v=" + v);
            cdlsync.countDown();

        }
    }

    public void testSync() throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(MAX_THREADS);
        long startTime = System.currentTimeMillis();
        SyncThread sync = new SyncThread(this, startTime);
        for (int i = 0; i < TASK_COUNT; i++) {
            exe.submit(sync);
        }
        cdlsync.await();
        exe.shutdown();
    }


    public class AtomicThread implements Runnable {
        protected String name;
        protected long starttime;

        public AtomicThread(long starttime) {
            this.starttime = starttime;
        }

        @Override
        public void run() {
            long v = acount.get();
            while (v < TARGET_COUNT) {
                v = acount.incrementAndGet();
            }

            long endTIme = System.currentTimeMillis();
            System.out.println("AtomicThread spend:" + (endTIme - starttime) + "ms" + " v=" + v);
            cdlatomic.countDown();
        }
    }

    public void testAtomic() throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(MAX_THREADS);
        long startTime = System.currentTimeMillis();
        AtomicThread sync = new AtomicThread(startTime);
        for (int i = 0; i < TASK_COUNT; i++) {
            exe.submit(sync);
        }
        cdlatomic.await();
        exe.shutdown();
    }


    public class LongAddrThread implements Runnable {
        protected String name;
        protected long starttime;

        public LongAddrThread(long starttime) {
            this.starttime = starttime;
        }

        @Override
        public void run() {
            long v = lacount.sum();
            while (v < TARGET_COUNT) {
                lacount.increment();
                v = lacount.sum();
            }

            long endTIme = System.currentTimeMillis();
            System.out.println("LongAddrThread spend:" + (endTIme - starttime) + "ms" + " v=" + v);
            cdladdr.countDown();
        }
    }

    public void testAtomicLong() throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(MAX_THREADS);
        long startTime = System.currentTimeMillis();
        LongAddrThread sync = new LongAddrThread(startTime);
        for (int i = 0; i < TASK_COUNT; i++) {
            exe.submit(sync);
        }
        cdladdr.await();
        exe.shutdown();
    }


    public static void main(String[] args) throws InterruptedException {
        LongAdderDemo longAdderDemo = new LongAdderDemo();
        longAdderDemo.testSync();

        longAdderDemo.testAtomic();

        longAdderDemo.testAtomicLong();

    }
}
