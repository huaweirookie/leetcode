package com.zhunongyun.toalibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author oscar
 * @date 2022/2/11 11:10
 */
public class LeetCode76 {

    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if (null == s || s.length() == 0 || null == t || t.length() == 0) {
            return "";
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            map.put(tChar, map.getOrDefault(tChar, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        while (right < s.length()) {
            char rightChar = s.charAt(right);

            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.getOrDefault(rightChar, 0) - 1);
            }
            right++;

            while (check(map)) {
                if (right - left < min) {
                    start = left;
                    min = right - left;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.getOrDefault(leftChar, 0) + 1);
                }
                left++;
            }
        }
        if (min != Integer.MAX_VALUE) {
            return s.substring(start, start + min);
        }
        return "";
    }

    private boolean check(Map<Character, Integer> map) {
        for (Integer value : map.values()) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }
}