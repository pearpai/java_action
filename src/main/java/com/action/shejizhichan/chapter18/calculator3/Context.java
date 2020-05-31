package com.action.shejizhichan.chapter18.calculator3;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 8:57
 * @Version 1.0
 */
public class Context {

    private Calculator cal = null;

    public Context(Calculator cal) {
        this.cal = cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }

}
