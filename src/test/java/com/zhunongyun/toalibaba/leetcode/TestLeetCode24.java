package com.zhunongyun.toalibaba.leetcode;

import com.zhunongyun.toalibaba.leetcode.LeetCode24;
import com.zhunongyun.toalibaba.leetcode.ListNode;
import com.zhunongyun.toalibaba.leetcode.DataUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 *
 *
 * @author oscar
 * @date 2022/1/27 11:03
 */
class TestLeetCode24 {

    private final LeetCode24 leetCode24 = new LeetCode24();

    private ListNode normalListNode = null;

    @BeforeEach
    void prepareData() {
        normalListNode = DataUtils.translateToListNode(1, 2, 3, 4);
    }

    @Test
    void normal() {
        ListNode listNode = leetCode24.swapPairs(normalListNode);
        AssertionErrors.assertTrue("正常测试用例异常", "2143".equals(DataUtils.translateListNodeToString(listNode)));
    }
}
