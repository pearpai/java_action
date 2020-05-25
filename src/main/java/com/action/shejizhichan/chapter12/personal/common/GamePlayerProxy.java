package com.action.shejizhichan.chapter12.personal.common;


/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 17:04
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
