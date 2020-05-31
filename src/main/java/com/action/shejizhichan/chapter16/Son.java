package com.action.shejizhichan.chapter16;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:17
 * @Version 1.0
 */
public class Son implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲都请示是：" + women.getRequest());
        System.out.println("儿子答复是：同意");
    }
}
