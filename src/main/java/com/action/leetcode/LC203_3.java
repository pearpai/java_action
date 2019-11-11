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

}
