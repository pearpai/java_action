package com.action.shejizhichan.chapter13.deepclone;

import com.sun.corba.se.impl.encoding.CDROutputObject;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:36
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 生成一个对象
        Thing thing = new Thing();

        thing.setValue("张三");
        // 拷贝一个对象 此时不执行构造函数
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
        System.out.println(cloneThing.getValue());
    }

}
