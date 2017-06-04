package com.action.algorithm.sort;

import com.action.utils.Num;

/**
 * 直接插入排序算法
 * 1、从第一个元素开始，该元素可以认为已经被排序
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 3、如果该元素（已排序）大于新元素，将该元素一道下一位置
 * 4、重复步骤3，直到找到已排序的元素系谣言或者等于新元素的位置
 * 5、将新元素插入到该位置中
 * 6、重复步骤2
 * 算法分析：
 * 1、算法的时间性能分析
 * ┌───────────────┬───────────┬───────────┬──────────┐
 * │ 初始文件状态    │   正序    │     反序   │无序(平均) │
 * ├───────────────┼───────────┼───────────┼──────────┤
 * │ 第i趟的关键    │   1       │     i+1    │（i-2）/2 │
 * │ 字比较次数     │           │            │         │
 * ├───────────────┼───────────┼────────────┼─────────┤
 * │总关键字比较次数  │n-1       │(n+2)(n-1)/2 │ ≈n2/4  │
 * ├───────────────┼───────────┼────────────┼─────────┤
 * │第i趟记录移动次数 │ 0        │     i+2    │（i-2）/2 │
 * ├───────────────┼───────────┼────────────┼─────────┤
 * │总的记录移动次数  │ 0        │(n-1)(n+4)/2│   ≈n2/4 │
 * ├───────────────┼───────────┼────────────┼─────────┤
 * │时间复杂度      │  0（n）    │ O（n2）     │ O（n2） │
 * └───────────────┴───────────┴────────────┴─────────┘
 * 插入排序：
 * 最差时间分析：O(n2)
 * 平均时间复杂度：O(n2)
 * 稳定度：稳定
 * 空间复杂度:O(1), 算法所需的辅助空间是一个监视哨，辅助空间复杂度S(n)=O(1)。是一个地排序
 * Created by wuyunfeng on 2017/6/2.
 */
public class Insertion {
    private static final int len = 10;

    public static void insertSort() {
        int[] a = new int[len];
        Num.get_array(10, 100, a);
        for (int i = 0; i < len; i++) {
            System.out.print(Integer.toString(a[i]) + ", ");
        }
        System.out.println();
        int temp, j;

        for (int i = 1; i < len; i++) {
            // 将需要比较的数值存入temp中
            temp = a[i];
            // 遍历数值
            for (j = i; j > 0 && temp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(Integer.toString(a[i]) + ", ");
        }

    }

    public static void main(String[] args) {
        insertSort2();
    }


    private static void insertSort2() {
        // 生成数组
        int[] arr = new int[len];
        // 数值赋值
        Num.get_array(100, 2000, arr);

        Num.printArray(arr);


        // 存储需要插入的值
        int temp;
        // 存储需要插入的位置
        int j;

        for (int i = 1; i < len; i++) {
            temp = arr[i];
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            // 如果走了 上面的for  上面的赋值是a[j] 下面的赋值其实是a[j-1] 因为j--
            arr[j] = temp;
        }

        Num.printArray(arr);


    }


}
