package com.action.utils;

import java.util.Arrays;
import java.util.Random;

/**
 * 提供一些 模拟数据方法
 * Created by wuyunfeng on 2017/6/2.
 */
public class Num {

    public static void get_array(int min, int max, int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(max) % (max - min + 1) + min;
            arr[i] = n;
        }
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

}
