package com.action.shejizhichan.chapter12;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 16:58
 * @Version 1.0
 */
public class Client {

//    public static void main(String[] args) {
//        // 定义一个痴迷玩家
//        IGamePlayer player = new GamePlayer("张三");
//        // 开始打游戏，几下时间戳
//        System.out.println("开始时间是：2009-8-25 10:45");
//        player.login("zhangSan", "password");
//        player.killBoos();
//        player.upgrade();
//        System.out.println("结束时间是： 2009-8-26 03:40");
//    }


    public static void main(String[] args) {
        // 定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");

        // 定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);

        // 开始打游戏，几下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        proxy.killBoos();
        proxy.upgrade();
        System.out.println("结束时间是： 2009-8-26 03:40");
    }

}
