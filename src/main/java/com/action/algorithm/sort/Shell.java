package com.action.algorithm.sort;

import com.action.utils.Num;

/**
 * 希尔排序
 * 维基百科：https://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
 * 也称递减增量排序算法，是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法。
 * 希尔排序是基于插入排序的一下两点性质而提出的改进方法：
 * 1、插入排序在对几乎已经排序号的数据操作时，效率高，既可以达到线性排序的效果
 * 2、但是插入排序一般来说是低效的，因为插入排序每一次只能将数据移动一位
 * Created by wuyunfeng on 2017/6/2.
 * [33, 22, 40, 55, 24, 47, 75, 25, 38, 81]
 * increment=5 步长为5  则将数组分为5组 [33, 47],[22, 75], [40, 25]... 对每一小组进行排序
 * <p>
 * <p>
 * O(n log2 n)
 * 步长
 * 步长序列	最坏情况下复杂度
 * {\displaystyle {n/2^{i}}} {n/2^i}    {\displaystyle {\mathcal {O}}} \mathcal{O} {\displaystyle (n^{2})} (n^2)
 * {\displaystyle 2^{k}-1} 2^k - 1	{\displaystyle {\mathcal {O}}} \mathcal{O} {\displaystyle (n^{3/2})} (n^{3/2})
 * {\displaystyle 2^{i}3^{j}} 2^i 3^j	{\displaystyle {\mathcal {O}}} \mathcal{O} {\displaystyle (n\log ^{2}n)} ( n\log^2 n )
 * <p>
 * 已知的最好步长序列是由Sedgewick提出的(1, 5, 19, 41, 109,...)，该序列的项来自 {\displaystyle 9\times 4^{i}-9\times 2^{i}+1} 9\times 4^{i}-9\times 2^{i}+1和 {\displaystyle 2^{i+2}\times (2^{i+2}-3)+1} 2^{{i+2}}\times (2^{{i+2}}-3)+1这两个算式[1]。这项研究也表明“比较在希尔排序中是最主要的操作，而不是交换。”用这样步长序列的希尔排序比插入排序要快，甚至在小数组中比快速排序和堆排序还快，但是在涉及大量数据时希尔排序还是比快速排序慢。
 * 另一个在大数组中表现优异的步长序列是（斐波那契数列除去0和1将剩余的数以黄金分区比的两倍的幂进行运算得到的数列）：(1, 9, 34, 182, 836, 4025, 19001, 90358, 428481, 2034035, 9651787, 45806244, 217378076, 1031612713,…)[2]
 *
 * 最差时间分析O(n*(logn)2)	平均时间复杂度O(n*(logn)2)	稳定度：不稳定	空间复杂度O(1)
 *
 *
 */
public class Shell {

    private final static int len = 15;

    private static void shellSort() {
        int[] arr = new int[len];
        Num.get_array(10, 100, arr);
        Num.printArray(arr);

        // 第一层遍历 设置步长 即为分成多少个小的数组
        for (int increment = len / 2; increment > 0; increment /= 2) {
            // 单个数组中需要插入的值
            int temp;
            // 当前需要插入的位置
            int i;
            // 以步长为初始位置 进行遍历 步长为 increment
            for (int x = increment; x < len; x += increment) {
                // 暂存当前位置arr[x]值，方便后续进行替换
                temp = arr[x];
                // 倒序遍历并且进行判断 当temp < arr[i - increment]时候 进行数值替换
                for (i = x; i > 0 && temp < arr[i - increment]; i -= increment) {
                    arr[i] = arr[i - increment];
                }
                // 通过上述for循环后 arr[i - increment] 即为 arr[i] 此时需要重新赋值
                arr[i] = temp;
            }
        }

        Num.printArray(arr);
    }


    public static void main(String[] args) {
        shellSort();
    }

}
