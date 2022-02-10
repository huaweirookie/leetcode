package com.zhunongyun.toalibaba.leetcode;

import com.zhunongyun.toalibaba.leetcode.LeetCode22;
import com.zhunongyun.toalibaba.leetcode.ListNode;
import com.zhunongyun.toalibaba.leetcode.DataUtils;
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
        normalListNode = DataUtils.translateToListNode(1, 2, 3, 4, 5);
    }

    @Test
    void normal() {
        ListNode listNode = leetCode22.getKthFromEnd(normalListNode, 2);
        AssertionErrors.assertTrue("正常测试用例异常", "45".equals(DataUtils.translateListNodeToString(listNode)));
    }
}
