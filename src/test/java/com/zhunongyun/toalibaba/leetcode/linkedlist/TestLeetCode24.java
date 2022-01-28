package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/1/27 11:03
 */
public class TestLeetCode24 {

    private final LeetCode24 leetCode24 = new LeetCode24();

    private ListNode normalListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = ListNodeUtils.translateToListNode(new int[]{1, 2, 3, 4});
    }

    @Test
    void normal() {
        ListNode listNode = leetCode24.swapPairs(normalListNode);
        Assert.isTrue("2143".equals(ListNodeUtils.translateToString(listNode)), "正常测试用例异常");
    }
}
