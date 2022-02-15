package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * 11. 盛最多水的容器
 *
 * @author oscar
 * @date 2022/2/15 20:59
 */
class TestLeetCode11 {

    private final LeetCode11 leetCode11 = new LeetCode11();

    private int[] normalList1 = null;

    private int[] normalList2 = null;

    @BeforeEach
    void prepareData() {
        normalList1 = DataUtils.translateToIntList(1, 8, 6, 2, 5, 4, 8, 3, 7);
        normalList2 = DataUtils.translateToIntList(1, 1);
    }

    @Test
    void normal1() {
        Integer result = leetCode11.maxArea(normalList1);
        AssertionErrors.assertTrue("正常测试用例1异常", result.equals(49));
    }

    @Test
    void normal2() {
        Integer result = leetCode11.maxArea(normalList2);
        AssertionErrors.assertTrue("正常测试用例2异常", result.equals(1));
    }
}