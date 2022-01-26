package com.zhunongyun.toalibaba.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/1/26 18:10
 */
public class TestLeetCode344 {

    private final LeetCode344 leetCode344 = new LeetCode344();

    private char[] data = null;

    @BeforeEach
    void prepareData() {
        data = new char[]{'h','e','l','l','o'};

    }

    @Test
    void test() {
//        leetCode344.reverseString(data);
        leetCode344.reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
