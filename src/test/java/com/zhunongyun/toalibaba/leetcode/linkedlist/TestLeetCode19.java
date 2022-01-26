package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/1/26 11:46
 */
public class TestLeetCode19 {

    private final LeetCode19 leetCode19 = new LeetCode19();

    private ListNode normalListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = ListNodeUtils.translateToListNode(new int[]{2, 4, 3, 5, 6});
    }

    @Test
    void firstListNode() {
        ListNode listNode = leetCode19.removeNthFromEnd(normalListNode, 5);
        Assert.isTrue("4356".equals(ListNodeUtils.translateToString(listNode)), "删除第一个结点测试用例异常");
    }

    @Test
    void lastListNode() {
        ListNode listNode = leetCode19.removeNthFromEnd(normalListNode, 1);
        Assert.isTrue("2435".equals(ListNodeUtils.translateToString(listNode)), "删除最后一个结点测试用例异常");
    }

    @Test
    void middleListNode() {
        ListNode listNode = leetCode19.removeNthFromEnd(normalListNode, 3);
        Assert.isTrue("2456".equals(ListNodeUtils.translateToString(listNode)), "删除倒数第三个结点测试用例异常");
    }

    @Test
    void overSize() {
        ListNode listNode = leetCode19.removeNthFromEnd(normalListNode, 6);
        Assert.isTrue(null == listNode, "n > length 测试用例异常");
    }

    @Test
    void minSize() {
        ListNode listNode = leetCode19.removeNthFromEnd(normalListNode, 0);
        Assert.isTrue(null == listNode, "n < 0 测试用例异常");
    }

    @Test
    void nullListNode() {
        ListNode listNode = leetCode19.removeNthFromEnd(null, 2);
        Assert.isTrue(null == listNode, "空测试用例异常");
    }
}
