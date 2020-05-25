package com.action.shejizhichan.chapter08.common;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 8:40
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
         * 后续处理
         */
    }

}
