package com.zhunongyun.toalibaba.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            if (map.containsKey((target - nums[i]))) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}