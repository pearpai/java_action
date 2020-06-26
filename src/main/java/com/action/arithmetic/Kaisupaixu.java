package com.action.arithmetic;

import java.util.HashMap;

public class Kaisupaixu {


    public void sort(int[] a, int low, int high) {

        int start = low;
        int end = high;

        int key = a[low];

        while (end > start) {
            while (end > start && a[end] >= key) {
                end--;
            }
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
        }


    }

    public static void main(String[] args) {
//        String s = "abcdaddad";
//        String s = "abcdabcde";
        String s = "abba";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        Integer[] dict = new Integer[128];

        while (end < s.length()) {
            char currentValue = s.charAt(end);
            if (dict[currentValue] != null) {
                System.out.println(start + "  " + (dict[currentValue] + 1) + "  " + dict[currentValue]);
                // 取最大是因为 end 前一个 可能在start的 前面 就是 前一个end的char 位置 已经比start 小了 所以此时不能 缩小
                start = Math.max(start, dict[currentValue] + 1);
//                start = dict[currentValue] + 1;
            }
            dict[currentValue] = end;
            maxLen = Math.max(maxLen, end - start + 1);
            System.out.println("======end - start + 1--->" + (end - start + 1));
            end++;
        }


        return maxLen;
    }


}
