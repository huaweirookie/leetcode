package com.zhunongyun.toalibaba.leetcode.linkedlist;

/**
 * 反转链表
 *
 * @author oscar
 * @date 2022/1/29 14:39
 */
public class LeetCode206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}