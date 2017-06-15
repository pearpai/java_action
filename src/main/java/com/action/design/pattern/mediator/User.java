package com.action.design.pattern.mediator;

/**
 * Created by wuyunfeng on 2017/6/15.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
