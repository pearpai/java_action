package com.action.threads.bfbcsz.chapter4;

/**
 * Created by wuyunfeng on 2017/6/29.
 */
public class SafePoint {

    private int x, y;

    private SafePoint(int[] a) {
        this(a[0], a[1]);
    }

    public SafePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SafePoint(SafePoint p) {
        this(p.get());
    }


    public synchronized int[] get(){
        return new int[]{x, y};
    }

    public synchronized void set(int x, int y){
        this.x = x;
        this.y = y;
    }
}
