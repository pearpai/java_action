package com.action.view.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 20:25
 * @Version 1.0
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类Hashmap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
