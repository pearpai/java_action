package com.action.shejizhichan.chapter12.subject;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 17:18
 * @Version 1.0
 */
public class Proxy implements Subject {

    private Subject subject;

    // 默认代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object ...objects) {

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    private void before(){
        // do something
    }

    // 善后处理
    private void after(){
        // do something
    }

}
