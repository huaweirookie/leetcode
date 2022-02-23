package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import java.util.List;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/2/22 15:05
 */
class TestLeetCode15 {

    private final LeetCode15 leetCode15 = new LeetCode15();

    @Test
    void normal1() {
        List<List<Integer>> result = leetCode15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        AssertionErrors.assertTrue("正常测试用例1异常", "[[-1,-1,2],[-1,0,1]]".equals(DataUtils.translateListAndListToString(result)));
    }

    @Test
    void normal2() {
        List<List<Integer>> result = leetCode15.threeSum(new int[]{-1, 0, 2});
        AssertionErrors.assertTrue("正常测试用例2异常", "[]".equals(DataUtils.translateListAndListToString(result)));
    }

    @Test
    void normal3() {
//        List<List<Integer>> result = leetCode15.threeSum(new int[]{-1, 0, 1, 2, -1, -4, 0, -1, 1});
//        AssertionErrors.assertTrue("正常测试用例3异常", "[[-1,-1,2],[-1,0,1]]".equals(DataUtils.translateListAndListToString(result)));
    }

    @Test
    void normal4() {
        List<List<Integer>> result = leetCode15.threeSum(new int[]{-1, 0});
        AssertionErrors.assertTrue("正常测试用例4异常", "[]".equals(DataUtils.translateListAndListToString(result)));
    }

    @Test
    void normal5() {
        List<List<Integer>> result = leetCode15.threeSum(new int[]{0, 0, 0});
        AssertionErrors.assertTrue("正常测试用例5异常", "[[0,0,0]]".equals(DataUtils.translateListAndListToString(result)));
    }
}