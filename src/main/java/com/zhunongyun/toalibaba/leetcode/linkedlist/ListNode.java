package com.zhunongyun.toalibaba.leetcode.linkedlist;

/**
 * 链表公共类
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}