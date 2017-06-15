package com.action.design.pattern.memento;

/**
 * Originator
 * Created by wuyunfeng on 2017/6/15.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFrom(Memento memento){
        state = memento.getState();
    }
}
