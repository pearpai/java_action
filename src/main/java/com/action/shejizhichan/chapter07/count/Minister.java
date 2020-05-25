package com.action.shejizhichan.chapter07.count;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 7:41
 * @Version 1.0
 */
public class Minister {


    public static void main(String[] args) {
        // 定义5个大臣
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个达成参拜的是：");
            emperor.say();
        }
    }

}
