package com.action.design.pattern.builder;

/**
 * 创建一个表示食物条目和食物包装的接口
 * Created by wuyunfeng on 2017/6/13.
 */
public interface Item {

    String name();
    Packing packing();
    float price();

}
