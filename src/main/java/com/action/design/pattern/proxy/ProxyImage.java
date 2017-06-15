package com.action.design.pattern.proxy;

/**
 * 接口实体类
 * Created by wuyunfeng on 2017/6/15.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
