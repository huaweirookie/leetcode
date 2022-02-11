package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

/**
 *
 *
 * @author oscar
 * @date 2022/2/11 17:45
 */
class TestLeetCode159 {

    private final LeetCode159 leetCode159 = new LeetCode159();

    @Test
    void normal1() {
        int result = leetCode159.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        AssertionErrors.assertTrue("正常测试用例1异常", result == 5);
    }

    @Test
    void normal2() {
        int result = leetCode159.lengthOfLongestSubstringTwoDistinct("eceba");
        AssertionErrors.assertTrue("正常测试用例2异常", result == 3);
    }

    @Test
    void normal3() {
        int result = leetCode159.lengthOfLongestSubstringTwoDistinct("aaaaaaaaaa");
        AssertionErrors.assertTrue("正常测试用例3异常", result == 10);
    }

    @Test
    void normal4() {
        int result = leetCode159.lengthOfLongestSubstringTwoDistinct("aaaaaaaaaabbbbbbbbbbbb");
        AssertionErrors.assertTrue("正常测试用例4异常", result == 22);
    }
}
