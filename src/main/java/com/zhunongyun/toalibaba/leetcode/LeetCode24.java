package com.zhunongyun.toalibaba.leetcode;

/**
 * swap-nodes-in-pairs
 *
 * @author oscar
 * @date 2022/1/27 9:09
 */
public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}