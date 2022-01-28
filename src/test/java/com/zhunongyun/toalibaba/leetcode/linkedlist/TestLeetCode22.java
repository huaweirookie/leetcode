package com.zhunongyun.toalibaba.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/1/28 18:05
 */
public class TestLeetCode22 {

    private final LeetCode22 leetCode22 = new LeetCode22();

    private ListNode normalListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = ListNodeUtils.translateToListNode(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void normal() {
        ListNode listNode = leetCode22.getKthFromEnd(normalListNode, 2);
        Assert.isTrue("45".equals(ListNodeUtils.translateToString(listNode)), "正常测试用例异常");
    }
}
