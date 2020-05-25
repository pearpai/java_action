package com.action.shejizhichan.chapter12.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 18:01
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 定义一个代练者
        IGamePlayer player = new GamePlayer("张三");

        // 定义handler
        InvocationHandler handler = new GamePlayIH(player);



        // 还是打游戏
        // 开始打游戏，几下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");

        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);


        proxy.login("zhangSan", "password");
        proxy.killBoos();
        proxy.upgrade();
        System.out.println("结束时间是： 2009-8-26 03:40");
    }

}
