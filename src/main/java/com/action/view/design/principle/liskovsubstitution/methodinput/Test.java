package com.action.view.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 20:26
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Base child = new Child();
        HashMap map = new HashMap();
        child.method(map);
    }
}
