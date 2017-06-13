package com.action.algorithm.sort;

import com.action.utils.Num;

/**
 * Created by wuyunfeng on 2017/6/5.
 */
public class Merge {

    private final static int len = 10;

    private static void merge_sort_recursive(int arr[], int reg[], int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start;
        int start2 = mid + 1;
        merge_sort_recursive(arr, reg, start1, mid);
        merge_sort_recursive(arr, reg, start2, end);
        int k = start;
        while (start1 <= mid && start2 <= end)
            reg[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= mid)
            reg[k++] = arr[start1++];
        while (start2 <= end)
            reg[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = reg[k];
    }

    private static void merge_sort(int arr[], int len) {
        int[] reg = new int[len * 2];
        merge_sort_recursive(arr, reg, 0, len - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[len];
        Num.get_array(10, 100, arr);
        Num.printArray(arr);
        merge_sort(arr, len);
        Num.printArray(arr);
    }


}
