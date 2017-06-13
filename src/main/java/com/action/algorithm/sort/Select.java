package com.action.algorithm.sort;

import com.action.utils.Num;

/**
 * 选择排序
 * 1、比较次数
 * 在第i趟排序中选出最小的关键字的记录，续做n-i次比较，因此比较次数为n(n-1)/2 = O(n2)
 * 2、记录移动次数
 * 当数组为正序时，移动次数为0
 * 当数组为反序时，每次排序均需要执行交换操作，总的移动次数取最大值3(n-1)
 * 3、直接选择排序是一个就地排序
 * 4、稳定分析：直接选择排序是不稳定的
 * Created by wuyunfeng on 2017/6/5.
 */
public class Select {

    public static final int len = 10;


    public static void selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length && arr[j] < arr[k]; j++) {
                // 此处对最小值进行表 arr[k]需要注意 比较过程中k是在变的 i 位置未变

                k = j;

            }

            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[len];
        Num.get_array(10, 100, arr);
        Num.printArray(arr);
        selectSort(arr);
        Num.printArray(arr);
    }

}
