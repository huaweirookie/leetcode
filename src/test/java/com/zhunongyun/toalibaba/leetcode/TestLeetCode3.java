package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/2/10 20:14
 */
public class TestLeetCode3 {

    private final LeetCode3 leetCode3 = new LeetCode3();

    @Test
    void normal1() {
        int result = leetCode3.lengthOfLongestSubstring("abcabcbb");
        AssertionErrors.assertTrue("正常测试用例1异常", 3 == result);
    }

    @Test
    void normal2() {
        int result = leetCode3.lengthOfLongestSubstring("bbbbb");
        AssertionErrors.assertTrue("正常测试用例2异常", 1 == result);
    }

    @Test
    void normal3() {
        int result = leetCode3.lengthOfLongestSubstring("pwwkew");
        AssertionErrors.assertTrue("正常测试用例3异常", 3 == result);
    }

    @Test
    void normal4() {
        int result = leetCode3.lengthOfLongestSubstring("abba");
        AssertionErrors.assertTrue("正常测试用例4异常", 2 == result);
    }
}