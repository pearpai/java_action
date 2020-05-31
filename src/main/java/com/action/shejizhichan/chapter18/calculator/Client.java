package com.action.shejizhichan.chapter18.calculator;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 8:47
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 10;
        int b = 2;
        String symbol = "-";
        System.out.println("运行结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }

}
