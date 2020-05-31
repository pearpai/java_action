package com.action.shejizhichan.chapter16;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 15:36
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
