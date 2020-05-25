package com.action.shejizhichan.chpter10.module;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 13:47
 * @Version 1.0
 */
public abstract class AbstractClass {

    // 基本方法
    protected abstract void doSomething();

    // 基本方法
    protected abstract void doAnything();

    // 模板方法
    public void templateMethod() {
        /**
         * 调用基本方法
         */
        this.doAnything();
        this.doSomething();
    }

}
