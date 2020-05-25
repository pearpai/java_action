package com.action.shejizhichan.chapter12.constraint;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 18:20
 * @Version 1.0
 */
public interface IGamePlayer {

    // 登录游戏
    public void login(String user, String password);

    // 杀怪，网络游戏的主要特色
    public void killBoos();

    // 升级
    public void upgrade();

    // 每个人都可以找一下自己的代理
    public IGamePlayer getProxy();

}
