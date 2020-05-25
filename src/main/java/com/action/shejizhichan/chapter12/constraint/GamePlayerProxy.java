package com.action.shejizhichan.chapter12.constraint;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 18:48
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
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
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
