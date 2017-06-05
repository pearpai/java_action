package com.action.algorithm.sort;


import com.action.utils.Num;

/**
 * 快速排序
 *
 * 平均时间复杂度
 * 尽管快速排序的最坏时间为 O(n2)，但就平均性能而言，
 * 它是基于关键字比较的内部排序算法中速度最快者，快速排序亦因此而得名。
 * 它的平均时间复杂度为 O(nlgn)。

 * 空间复杂度
 * 快速排序在系统内部需要一个栈来实现递归。若每次划分较为均匀，
 * 则其递归树的高度为 O(lgn)，故递归后需栈空间为 O(lgn)。最坏情况下，
 * 递归树的高度为 O(n)，所需的栈空间为 O(n)。

 * 稳定性
 * 快速排序是非稳定的，例如[2，2，1]。
 * Created by wuyunfeng on 2017/6/2.
 */
public class Quick {
    /**
     * 感想：快速排序方式 很快就能理解，但是用java实现让我遇到了些麻烦
     * 因为之前一直使用的语言为 erlang 快速排代码结构非常简单
     * 用java 来实现确实然有点无法适应
     * 好好看到了图形结构 然后进行一次图形结构分析 理解了 实现方式
     * 第一步 以数组第start 数组 作为基准数值
     * 第二步 通过遍历的方式 （1）倒序找到 第一个小于 基准值的位置 （2）正序找到 第一个大于 基准值的位置
     *       两次 都在随后进行数据调换 并 在最后返回当前基准值所在的位置
     * 第三步 进行递归
     */


    private final static int len = 10;


    public static int getMiddle(int[] arr, int start, int end) {

        int temp = arr[start];
        while (start < end) {
            // 倒序找到 第一个小于 基准值的位置
            while (start < end && arr[end] > temp) {
                end--;
            }
            arr[start] = arr[end];
            // 正序找到 第一个大于 基准值的位置
            while (start < end && arr[start] <= temp) {
                start++;
            }
            arr[end] = arr[start];
        }
        System.out.println(start);
        arr[start] = temp;
        return start;
    }

    // 快速排序
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = getMiddle(arr, start, end);
            quickSort(arr, start, middle - 1);
            quickSort(arr, middle + 1, end);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[len];
        Num.get_array(10, 100, arr);
        Num.printArray(arr);
        quickSort(arr, 0, len-1);
        Num.printArray(arr);


    }

}
