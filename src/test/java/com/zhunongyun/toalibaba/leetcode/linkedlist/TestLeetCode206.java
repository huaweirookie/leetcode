package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * 反转链表
 *
 * @author oscar
 * @date 2022/1/29 16:14
 */
class TestLeetCode206 {

    private final LeetCode206 leetCode206 = new LeetCode206();

    private ListNode normalListNode = null;

    private ListNode shortListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = ListNodeUtils.translateToListNode(new int[]{1, 2, 3, 4, 5});
        shortListNode = ListNodeUtils.translateToListNode(new int[]{1});
    }

    @Test
    void normalListNode() {
        ListNode listNode = leetCode206.reverseList(normalListNode);
        AssertionErrors.assertTrue("正常测试用例异常", "54321".equals(ListNodeUtils.translateToString(listNode)));
    }

    @Test
    void shortListNode() {
        ListNode listNode = leetCode206.reverseList(shortListNode);
        AssertionErrors.assertTrue("正常测试用例异常", "1".equals(ListNodeUtils.translateToString(listNode)));
    }
}