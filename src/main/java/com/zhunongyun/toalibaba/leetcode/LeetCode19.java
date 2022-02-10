package com.zhunongyun.toalibaba.leetcode;

/**
 * removeNthFromEnd
 *
 * @author oscar
 * @date 2022/1/25 17:38
 */
public class LeetCode19 {

    /**
     * 1. 校验 n 的取值范围 在 1 <= n <= length
     * 2. 校验 ListNode
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || n <= 0) {
            return null;
        }

        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode current = result;

        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }

        if (n > length) {
            return null;
        }

        int i = -1;
        while (current != null) {
            if (i == length - n - 1) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
            i++;
        }
        return result.next;
    }
}