package com.zhunongyun.toalibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author oscar
 * @date 2022/2/11 17:17
 */
public class LeetCode159 {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            while (map.keySet().size() > 2) {
                char leftChar = s.charAt(left);
                if (map.get(leftChar).equals(1)) {
                    map.remove(leftChar);
                } else {
                    map.put(leftChar, map.get(leftChar) - 1);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
