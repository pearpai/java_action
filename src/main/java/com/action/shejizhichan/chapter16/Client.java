package com.action.shejizhichan.chapter16;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:19
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        // 定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                System.out.println("\n------------------女儿向父亲请示---------------------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n------------------妻子向丈夫请示---------------------");
                father.HandleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("\n------------------母亲向儿子请示---------------------");
                father.HandleMessage(women);
            } else {
                // 暂时什么也不做
            }

        }
    }

}
