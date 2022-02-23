package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * 最长回文子串
 *
 * @author oscar
 * @date 2022/2/22 11:27
 */
class TestLeetCode5 {

    private final LeetCode5 leetCode5 = new LeetCode5();

    @Test
    void normal1() {
        String result = leetCode5.longestPalindrome("babad");
        AssertionErrors.assertTrue("正常测试用例1异常", "bab".equals(result));
    }

    @Test
    void normal2() {
        String result = leetCode5.longestPalindrome("cbbd");
        AssertionErrors.assertTrue("正常测试用例2异常", "bb".equals(result));
    }

    @Test
    void normal3() {
        String result = leetCode5.longestPalindrome("b");
        AssertionErrors.assertTrue("正常测试用例3异常", "b".equals(result));
    }

    @Test
    void normal4() {
        String result = leetCode5.longestPalindrome("");
        AssertionErrors.assertTrue("正常测试用例4异常", "".equals(result));
    }
}
