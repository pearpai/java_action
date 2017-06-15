package com.action.design.pattern.memento;

/**
 * Memento
 * Created by wuyunfeng on 2017/6/15.
 */

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
