package com.action.jdxchxjs.ch03.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyunfeng on 2017/9/21.
 */
public class MyList {

    private static List<String> list = new ArrayList<>();

    public static void add() {
        list.add("anything");
    }

    public static int size() {
        return list.size();
    }
}
