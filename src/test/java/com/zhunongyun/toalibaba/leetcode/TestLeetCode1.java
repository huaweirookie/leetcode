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
public class TestLeetCode1 {

    private final LeetCode1 leetCode1 = new LeetCode1();

    private int[] normalList = null;

    @BeforeEach
    void prepareData() {
        // 正常测试用例
        normalList = DataUtils.translateToIntList(2, 7, 11, 15);
    }

    @Test
    void normal() {
        int[] result = leetCode1.twoSum(normalList, 9);
        AssertionErrors.assertTrue("正常测试用例异常", "01".equals(DataUtils.translateIntToString(result)));
    }
}
