package com.action.shejizhichan.chapter18;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 22:51
 * @Version 1.0
 */
public class Context {

    // 构造函数，你要使用哪个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 使用计谋了，看我出招
    public void operate(){
        this.strategy.operate();
    }

}
