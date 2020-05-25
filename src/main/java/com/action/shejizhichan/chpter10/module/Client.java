package com.action.shejizhichan.chpter10.module;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 13:51
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();
        class2.templateMethod();
    }

}
