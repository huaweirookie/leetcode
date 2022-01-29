package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 *
 *
 * @author oscar
 * @date 2022/1/28 18:05
 */
class TestLeetCode22 {

    private final LeetCode22 leetCode22 = new LeetCode22();

    private ListNode normalListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = ListNodeUtils.translateToListNode(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void normal() {
        ListNode listNode = leetCode22.getKthFromEnd(normalListNode, 2);
        AssertionErrors.assertTrue("正常测试用例异常", "45".equals(ListNodeUtils.translateToString(listNode)));
    }
}
