package com.action.shejizhichan.chapter16.zeren;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 17:04
 * @Version 1.0
 */
public class Women implements IWomen {

    /**
     * 1--未出嫁
     * 2--出价
     * 3--夫死
     *
     * @return int
     */
    private int type = 0;

    // 妇女请示
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿都请求是： " + request;
                break;
            case 2:
                this.request = "妻子都请求是： " + request;
                break;
            case 3:
                this.request = "母亲都请求是： " + request;
                break;
        }


        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }

}
