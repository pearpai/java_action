package com.action.shejizhichan.chapter16.zeren;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:17
 * @Version 1.0
 */
public class Husband extends Handler {


    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n------------------妻子向丈夫请示---------------------");
        System.out.println(women.getRequest());
        System.out.println("丈夫答复是：同意");
    }
}
