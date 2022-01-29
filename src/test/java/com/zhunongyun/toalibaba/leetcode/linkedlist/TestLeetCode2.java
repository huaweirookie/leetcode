package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 *
 *
 * @author oscar
 * @date 2022/1/25 18:07
 */
class TestLeetCode2 {

    private final LeetCode2 leetCode2 = new LeetCode2();

    private ListNode normalListNode1 = null;

    private ListNode normalListNode2 = null;

    private ListNode longListNode1 = null;

    private ListNode longListNode2 = null;

    @BeforeEach
    void prepareData() {
        // 正常测试用例
        normalListNode1 = ListNodeUtils.translateToListNode(new int[]{2, 4, 3});
        normalListNode2 = ListNodeUtils.translateToListNode(new int[]{5, 6, 4});
        longListNode1 = ListNodeUtils.translateToListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        longListNode2 = ListNodeUtils.translateToListNode(new int[]{9, 9, 9, 9});
    }

    /**
     * 正常测试用例
     */
    @Test
    void normal() {
        ListNode result = leetCode2.addTwoNumbers(normalListNode1, normalListNode2);
        AssertionErrors.assertTrue("正常测试用例异常", "708".equals(ListNodeUtils.translateToString(result)));
    }

    /**
     * 两组单个元素测试用例
     */
    @Test
    void oneAndOne() {
        ListNode result = leetCode2.addTwoNumbers(new ListNode(0), new ListNode(0));
        AssertionErrors.assertTrue("两组单个元素测试用例异常", "0".equals(ListNodeUtils.translateToString(result)));
    }

    /**
     * 一个正常测试用例 + null
     */
    @Test
    void normalAndNull() {
        ListNode result = leetCode2.addTwoNumbers(normalListNode1, null);
        AssertionErrors.assertTrue("正常测试用例 + null测试用例异常", "243".equals(ListNodeUtils.translateToString(result)));
    }

    /**
     * 两个长度不一样的测试用例
     */
    @Test
    void shortAndLong() {
        ListNode result = leetCode2.addTwoNumbers(longListNode1, longListNode2);
        AssertionErrors.assertTrue("两个长度不一样的测试用例异常", "89990001".equals(ListNodeUtils.translateToString(result)));
    }
}