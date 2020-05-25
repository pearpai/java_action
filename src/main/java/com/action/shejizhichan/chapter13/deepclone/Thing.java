package com.action.shejizhichan.chapter13.deepclone;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:34
 * @Version 1.0
 */
public class Thing implements Cloneable {

    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

}
