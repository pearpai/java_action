package com.action.shejizhichan.chapter13.construcedonotexec;

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

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }
}
