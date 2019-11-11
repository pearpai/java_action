package com.action.leetcode;

/**
 * Summary:
 * Created by wuyunfeng on 25. 10月 2019 16:16.
 */
public class LC203 {

    public ListNode removeElements(ListNode head, int val) {


        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if (head == null) {
            return null;
        }
        ListNode h = head;

        while (head.next != null) {
            if (head.next.val == val) {
                ListNode delNode = head.next;
                head.next = head.next.next;
                delNode.next = null;
            } else {
                head = head.next;
            }
        }

        return h;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
