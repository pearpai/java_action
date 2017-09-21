package com.action.jdxchxjs.ch03.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class ThreadRead extends Thread {

    private ReadData read;
    private PipedInputStream input;


    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
