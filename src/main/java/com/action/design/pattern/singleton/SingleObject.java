package com.action.design.pattern.singleton;

/**
 * 单例
 * Created by wuyunfeng on 2017/6/13.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
