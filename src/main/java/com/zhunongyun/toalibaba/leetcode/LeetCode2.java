package com.zhunongyun.toalibaba.leetcode;

/**
 * add-two-numbers
 *
 * @author oscar
 * @date 2022/1/25 17:38
 */
public class LeetCode2 {

    /**
     * 1. 需要考虑两个链表为空的情况
     * 2. 需要考虑计算进位问题
     * 3. 需要考虑两个链表长度不一致, 短的链表需要荣光补 0 来实现
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        } else if (null == l1 || null == l2) {
            return null == l1 ? l2 : l1;
        }

        ListNode result = new ListNode(-1);
        ListNode current = result;

        int increase = 0;
        while (l1 != null || l2 != null || increase != 0) {
            int sum = (null == l1 ? 0 : l1.val) + (null == l2 ? 0 : l2.val) + increase;
            current.next = new ListNode(sum % 10);
            increase = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            current = current.next;
        }

        return result.next;
    }
}