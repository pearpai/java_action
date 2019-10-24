package com.action.effectivejava3.item30;

import java.util.function.UnaryOperator;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 09. 8月 2019 10:42
 */
public class GenericSingletonFactory {

    /**
     * 通用单工厂模式
     */
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    /**
     * 示例程序行使通用的单例
     *
     * @param args args
     */
    public static void main(String[] args) {
        String[] strings = {"jute", "hemp", "nylon"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }
        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }


}
