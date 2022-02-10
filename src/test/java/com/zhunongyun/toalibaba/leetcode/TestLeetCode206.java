package com.zhunongyun.toalibaba.leetcode;

import com.zhunongyun.toalibaba.leetcode.LeetCode206;
import com.zhunongyun.toalibaba.leetcode.ListNode;
import com.zhunongyun.toalibaba.leetcode.DataUtils;
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
        normalListNode = DataUtils.translateToListNode(1, 2, 3, 4, 5);
        shortListNode = DataUtils.translateToListNode(1);
    }

    @Test
    void normalListNode() {
        ListNode listNode = leetCode206.reverseList(normalListNode);
        AssertionErrors.assertTrue("正常测试用例异常", "54321".equals(DataUtils.translateListNodeToString(listNode)));
    }

    @Test
    void shortListNode() {
        ListNode listNode = leetCode206.reverseList(shortListNode);
        AssertionErrors.assertTrue("正常测试用例异常", "1".equals(DataUtils.translateListNodeToString(listNode)));
    }
}