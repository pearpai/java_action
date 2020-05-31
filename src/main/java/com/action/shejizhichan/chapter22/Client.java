package com.action.shejizhichan.chapter22;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // 定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 观察早餐
        Spy spy = new Spy(hanFeiZi, liSi, "breakfast");
        spy.start();
        hanFeiZi.setHavingBreakfast(true);
        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();

        Thread.sleep(1000);
        spy.setType("breakfast");
        hanFeiZi.setHavingFun(true);
        Thread.sleep(1000);

        hanFeiZi.haveFun();
    }

}
