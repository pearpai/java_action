package com.action.shejizhichan.chapter18.calculator4;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-27 9:54
 * @Version 1.0
 */
public enum Calculator {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    // 减法运算
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    String value;

    Calculator(String value) {
        this.value = value;
    }

    // 获得美剧成员值
    public String getValue() {
        return this.value;
    }

    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
