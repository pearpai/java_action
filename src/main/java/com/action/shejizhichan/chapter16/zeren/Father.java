package com.action.shejizhichan.chapter16.zeren;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 16:17
 * @Version 1.0
 */
public class Father extends Handler {


    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n------------------女儿向父亲请示---------------------");
        System.out.println(women.getRequest());
        System.out.println("父亲答复是：同意");
    }
}
