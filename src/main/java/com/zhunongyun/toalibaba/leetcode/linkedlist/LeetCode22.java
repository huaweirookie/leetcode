package com.zhunongyun.toalibaba.leetcode.linkedlist;

/**
 *
 *
 * @author oscar
 * @date 2022/1/28 17:54
 */
public class LeetCode22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        int length = 0;
        ListNode current = head;
        while (current != null) {
            ++length;
            current = current.next;
        }

        current = head;
        int i = 0;
        while (current != null) {
            if (length - i == k) {
                break;
            }
            current = current.next;
            i++;
        }
        return current;
    }
}
