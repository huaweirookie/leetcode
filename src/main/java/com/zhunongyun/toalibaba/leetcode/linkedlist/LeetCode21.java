package com.zhunongyun.toalibaba.leetcode.linkedlist;

/**
 * merge-two-sorted-lists
 *
 * @author oscar
 * @date 2022/1/26 14:33
 */
public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (null == list1 && null == list2) {
            return null;
        } else if (null == list1 || null == list2) {
            return null == list1 ? list2 : list1;
        }

        ListNode result = new ListNode(-99999);
        result.next = list1;
        ListNode current = result;
        while (current != null && list2 != null) {
            if (current.val <= list2.val) {
                if (current.next != null) {
                    if (list2.val <= current.next.val) {
                        ListNode temp = list2.next;
                        list2.next = current.next;
                        current.next = list2;
                        list2 = temp;
                    }
                    current = current.next;
                } else {
                    current.next = list2;
                    break;
                }
            }
        }

        return result.next;
    }

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoListsForRecursion(ListNode list1, ListNode list2) {
        if (null == list1 && null == list2) {
            return null;
        } else if (null == list1 || null == list2) {
            return null == list1 ? list2 : list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsForRecursion(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsForRecursion(list1, list2.next);
            return list2;
        }
    }
}
