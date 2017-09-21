package com.action.jdxchxjs.ch03.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedOutputStream out;


    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
