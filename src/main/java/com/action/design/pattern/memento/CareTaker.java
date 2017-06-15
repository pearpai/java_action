package com.action.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * CareTaker
 * Created by wuyunfeng on 2017/6/15.
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }

}
