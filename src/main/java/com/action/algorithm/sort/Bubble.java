package com.action.algorithm.sort;

import com.action.utils.Num;

/**
 * 冒泡排序
 * 重复地走访过要排序的数量，异常标记两个元素，如果他们的属性错误把他们交换过来。
 * n个项目需要O(n2)的比较次数，且可以原地排序。尽管这个算法是最简单了解和实现的排序算法之一，但它对于包含大量的元素的数列排序是很没有效率的。
 * 最差时间分析O(n2)	平均时间复杂度O(n2)	稳定	  空间复杂度O(1)
 * Created by wuyunfeng on 2017/6/2.
 */
public class Bubble {

    private final static int len = 10;

    private static void bubbleSort() {

        int[] arr = new int[len];
        Num.get_array(10, 100, arr);
        Num.printArray(arr);

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = arr[i];
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Num.printArray(arr);


    }


    public static void main(String[] args) {
        bubbleSort();
    }

}
