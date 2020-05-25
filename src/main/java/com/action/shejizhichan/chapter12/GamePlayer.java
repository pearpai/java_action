package com.action.shejizhichan.chapter12;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 16:55
 * @Version 1.0
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoos() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级");
    }
}
