package com.action.shejizhichan.chapter18.calculator3;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 8:47
 * @Version 1.0
 */
public class Client {


    // 加符号
    private final static String ADD_SYMBOL = "+";

    // 减符号
    private final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        String symbol = "-";
        Context context=null;
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new AddCalculator());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new SubCalculator());
        }
        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }

}
