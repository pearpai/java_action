package com.action.jdxchxjs.ch03.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class MyList {

    private List<String> list = new ArrayList<>();

    public void add(){
        list.add("高洪岩");
    }

    public int size(){
        return list.size();
    }

}
