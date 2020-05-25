package com.action.shejizhichan.chapter12.dynamic;


/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 17:04
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer = null;



    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoos() {
        this.gamePlayer.killBoos();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级费用是：150元");
    }
}
