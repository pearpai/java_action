package com.action.design.pattern.singleton;

/**
 * 获取singleton 唯一对象
 * Created by wuyunfeng on 2017/6/13.
 */
public class SingletonPatternDemo {


    public static void main(String[] args) {
        // 不合法
        // SingleObject object = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();
    }

}
