package com.action.interview.baidu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 手写进制算法，求出一个数的二进制数1的个数
 * Created by wuyunfeng on 2017/9/18.
 */
public class Binary {

    public static void main(String[] args) {

        int x = 10;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (x % 2 == 1) {
                count++;
            }
            list.add(x % 2);
            x = x / 2;
            if (x == 0)
                break;
        }
        Collections.reverse(list);
        list.forEach(System.out::print);
        System.out.println();
        System.out.println(count);


    }

}
