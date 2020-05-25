package com.action.shejizhichan.chapter07;

/**
 * @Description 臣子类
 * @Author wuyunfeng
 * @Date 2020-05-23 19:03
 * @Version 1.0
 */
public class Minister {

    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }

}
