package com.zhunongyun.toalibaba.leetcode;

import com.zhunongyun.toalibaba.leetcode.LeetCode21;
import com.zhunongyun.toalibaba.leetcode.ListNode;
import com.zhunongyun.toalibaba.leetcode.DataUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * merge-two-sorted-lists
 *
 * @author oscar
 * @date 2022/1/26 15:31
 */
class TestLeetCode21 {

    private final LeetCode21 leetCode21 = new LeetCode21();

    private ListNode normalListNode1 = null;

    private ListNode normalListNode2 = null;

    private ListNode earlyNullListNode1 = null;

    private ListNode earlyNullListNode2 = null;

    private ListNode minListNode2 = null;

    @BeforeEach
    void prepareData() {
        normalListNode1 = DataUtils.translateToListNode(3, 5, 7, 9);
        normalListNode2 = DataUtils.translateToListNode(4, 6, 8, 10);
        earlyNullListNode1 = DataUtils.translateToListNode(3, 5, 7);
        earlyNullListNode2 = DataUtils.translateToListNode(4, 6, 8);
        minListNode2 = DataUtils.translateToListNode(1, 2, 8);
    }

    @Test
    void normalListNode() {
        ListNode listNode = leetCode21.mergeTwoLists(normalListNode1, normalListNode2);
        AssertionErrors.assertTrue("两个正常测试用例异常", "345678910".equals(DataUtils.translateListNodeToString(listNode)));
    }

    @Test
    void earlyNullListNode1() {
        ListNode listNode = leetCode21.mergeTwoLists(earlyNullListNode1, normalListNode2);
        AssertionErrors.assertTrue("list1遍历完测试用例异常", "34567810".equals(DataUtils.translateListNodeToString(listNode)));
    }

    @Test
    void earlyNullListNode2() {
        ListNode listNode = leetCode21.mergeTwoLists(normalListNode1, earlyNullListNode2);
        AssertionErrors.assertTrue("list2遍历完测试用例异常", "3456789".equals(DataUtils.translateListNodeToString(listNode)));
    }

    @Test
    void minListNode2() {
        ListNode listNode = leetCode21.mergeTwoLists(normalListNode1, minListNode2);
        AssertionErrors.assertTrue("list2第一个结点小于list1第一个结点测试用例异常", "1235789".equals(DataUtils.translateListNodeToString(listNode)));
    }
}