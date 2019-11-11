package com.action.leetcode;

/**
 * Summary:
 * Created by wuyunfeng on 25. 10月 2019 16:16.
 */
public class LC203_3 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    private static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l) {

        if (arr.length == l) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

}
