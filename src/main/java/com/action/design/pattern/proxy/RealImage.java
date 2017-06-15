package com.action.design.pattern.proxy;

/**
 * 接口实体类
 * Created by wuyunfeng on 2017/6/15.
 */
public class RealImage implements Image {
    private String fileName;


    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
