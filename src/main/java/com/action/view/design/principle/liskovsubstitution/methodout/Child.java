package com.action.view.design.principle.liskovsubstitution.methodout;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 20:31
 * @Version 1.0
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
