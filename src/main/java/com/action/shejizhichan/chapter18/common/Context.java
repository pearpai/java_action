package com.action.shejizhichan.chapter18.common;

/**
 * @Description 封装角色
 * @Author wuyunfeng
 * @Date 2020-05-27 8:10
 * @Version 1.0
 */
public class Context {

    // 抽象策略
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }

}
