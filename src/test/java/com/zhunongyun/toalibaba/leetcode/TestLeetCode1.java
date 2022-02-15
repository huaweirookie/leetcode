package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/2/10 17:47
 */
class TestLeetCode1 {

    private final LeetCode1 leetCode1 = new LeetCode1();

    private int[] normalList = null;

    private int[] oneList = null;

    private int[] twoList = null;

    @BeforeEach
    void prepareData() {
        // 正常测试用例
        normalList = DataUtils.translateToIntList(2, 7, 11, 15);
        oneList = DataUtils.translateToIntList(2);
        twoList = DataUtils.translateToIntList(3, 3);
    }

    @Test
    void normal() {
        int[] result = leetCode1.twoSum(normalList, 9);
        AssertionErrors.assertTrue("正常测试用例异常", "01".equals(DataUtils.translateListToString(result)));
    }

    @Test
    void nullData() {
        int[] result = leetCode1.twoSum(null, 9);
        AssertionErrors.assertTrue("无元素测试用例异常", "00".equals(DataUtils.translateListToString(result)));
    }

    @Test
    void one() {
        int[] result = leetCode1.twoSum(oneList, 9);
        AssertionErrors.assertTrue("一个元素测试用例异常", "00".equals(DataUtils.translateListToString(result)));
    }

    @Test
    void two() {
        int[] result = leetCode1.twoSum(twoList, 6);
        AssertionErrors.assertTrue("两个元素测试用例异常", "01".equals(DataUtils.translateListToString(result)));
    }
}
