package com.action.jdxchxjs.ch03.waitOId;

//import com.sun.beans.decoder.ValueObject;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class Add {

    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
        }
    }
}
