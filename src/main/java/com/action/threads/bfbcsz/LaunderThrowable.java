package com.action.threads.bfbcsz;

/**
 * Created by wuyunfeng on 2017/7/4.
 */
public class LaunderThrowable {

    public static RuntimeException launderThrowable(Throwable throwable){
        if (throwable instanceof  RuntimeException){
            return (RuntimeException) throwable;
        }else if (throwable instanceof Error){
            throw (Error) throwable;
        }else {
            throw new IllegalStateException("Not unchecked", throwable);
        }
    }

}
