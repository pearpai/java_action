package com.action.shejizhichan.chapter12.constraint;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 18:42
 * @Version 1.0
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public void killBoos() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    // 校验是否是代理访问
    private boolean isProxy() {
        return this.proxy != null;
    }

}
