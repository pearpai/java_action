package com.action.gaobingfachenxusheji.chapter05.guava;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {

    private String para;

    public RealData(String para) {
        this.para = para;
    }

    @Override
    public String call() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(para);
            Thread.sleep(100);
        }

        return sb.toString();
    }



}
