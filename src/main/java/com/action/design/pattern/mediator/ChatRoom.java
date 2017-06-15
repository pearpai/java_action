package com.action.design.pattern.mediator;

import java.util.Date;

/**
 * 创建中介类
 * Created by wuyunfeng on 2017/6/15.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}
