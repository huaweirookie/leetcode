package com.zhunongyun.toalibaba.leetcode;

/**
 * reverse-string
 *
 * @author oscar
 * @date 2022/1/26 18:03
 */
public class LeetCode344 {

    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        handler(s, 0, s.length - 1);
    }

    public void handler(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        handler(s, start + 1, end - 1);
    }
}
