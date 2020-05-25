package com.action.shejizhichan.chapter09.product;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 12:52
 * @Version 1.0
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
