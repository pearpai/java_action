package com.action.shejizhichan.chapter16.zeren;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:17
 * @Version 1.0
 */
public class Son extends Handler {


    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n------------------母亲向儿子请示---------------------");
        System.out.println(women.getRequest());
        System.out.println("儿子答复是：同意");
    }
}
