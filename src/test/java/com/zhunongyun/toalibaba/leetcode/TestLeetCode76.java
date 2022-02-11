package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 *
 *
 * @author oscar
 * @date 2022/2/11 16:45
 */
class TestLeetCode76 {

    private final LeetCode76 leetCode76 = new LeetCode76();

    @BeforeEach
    void prepareData() {
    }

    @Test
    void normal() {
        String result = leetCode76.minWindow("ADOBECODEBANC", "ABC");
        AssertionErrors.assertTrue("正常测试用例异常", "BANC".equals(result));
    }
}