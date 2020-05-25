package com.action.shejizhichan.chapter12.personal.common;

/**
 * @Description 游戏者接口
 * @Author wuyunfeng
 * @Date 2020-05-24 16:53
 * @Version 1.0
 */
public interface IGamePlayer {

    // 登录游戏
    public void login(String user, String password);

    // 杀怪，网络游戏的主要特色
    public void killBoos();

    // 升级
    public void upgrade();

}
