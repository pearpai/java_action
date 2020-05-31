package com.action.shejizhichan.chapter16.zeren;

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
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
           father.HandleMessage(women);

        }
    }

}
