package com.zhunongyun.toalibaba.leetcode.algorithm;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        if (null == s || "".equals(s)) {
            return ans;
        }

        int n = s.length();
        Map<Character, Integer> map = new HashMap<>(n);
        for (int start = 0, end = 0; end < n; end++) {
            Character data = s.charAt(end);
            if (map.containsKey(data)) {
                start = Math.max(map.get(data), start);
//                start = map.get(data);
            }

            ans = Math.max(ans, end - start + 1);
            map.put(data, end + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode3 leetCode3 = new LeetCode3();

        Assert.isTrue(3 == leetCode3.lengthOfLongestSubstring("abcabcbb"), "成功");
        Assert.isTrue(1 == leetCode3.lengthOfLongestSubstring("bbbbb"), "成功");
        Assert.isTrue(3 == leetCode3.lengthOfLongestSubstring("pwwkew"), "成功");
        Assert.isTrue(0 == leetCode3.lengthOfLongestSubstring(""), "成功");
        Assert.isTrue(2 == leetCode3.lengthOfLongestSubstring("abba"), "成功");
    }
}
