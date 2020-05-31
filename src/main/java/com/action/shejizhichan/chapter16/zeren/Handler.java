package com.action.shejizhichan.chapter16.zeren;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:50
 * @Version 1.0
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理级别
    private int level = 0;

    // 责任传递，下一个人责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    // 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("------没地方请示了，安不同意处理------");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);
}
