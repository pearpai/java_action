package com.action.design.pattern.proxy;

/**
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 * Created by wuyunfeng on 2017/6/15.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();

        System.out.println();
        image.display();
    }
}
