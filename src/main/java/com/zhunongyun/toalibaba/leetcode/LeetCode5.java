package com.zhunongyun.toalibaba.leetcode;

/**
 * 最长回文子串
 *
 * @author oscar
 * @date 2022/2/22 8:51
 */
public class LeetCode5 {

    public String longestPalindrome(String s) {
        if (null == s || s.length() < 2) {
            return s;
        }

        // 保存结果, 第一个保存起始位置, 第二个保存回文长度
        int[] result = new int[2];
        for (int i = 0; i < s.length(); i++) {
            int[] singular = centerSpread(s, i, i);
            int[] dual = centerSpread(s, i, i + 1);
            int[] max = singular[1] > dual[1] ? singular : dual;

            if (max[1] > result[1]) {
                result = max;
            }
        }
        return s.substring(result[0], result[0] + result[1]);
    }

    private int[] centerSpread(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right - left - 1};
    }
}
