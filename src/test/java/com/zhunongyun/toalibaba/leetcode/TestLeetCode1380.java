package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 *
 * @author oscar
 * @date 2022/2/15 19:47
 */
class TestLeetCode1380 {

    private final LeetCode1380 leetCode1380 = new LeetCode1380();

    private int[][] normalList1 = null;

    private int[][] normalList2 = null;

    @BeforeEach
    void prepareData() {
        normalList1 = DataUtils.translateToIntList(new int[]{3,7,8}, new int[]{9,11,13}, new int[]{15,16,17});
        normalList2 = DataUtils.translateToIntList(new int[]{1,10,4,2}, new int[]{9,3,8,7}, new int[]{15,16,17,12});
    }

    @Test
    void normal1() {
        List<Integer> result = leetCode1380.luckyNumbers(normalList1);
        AssertionErrors.assertTrue("正常测试用例1异常", "15".equals(DataUtils.translateListToString(result)));
    }

    @Test
    void normal2() {
        List<Integer> result = leetCode1380.luckyNumbers(normalList2);
        AssertionErrors.assertTrue("正常测试用例2异常", "12".equals(DataUtils.translateListToString(result)));
    }

}
