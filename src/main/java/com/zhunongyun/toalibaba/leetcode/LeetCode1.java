package com.zhunongyun.toalibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author oscar
 * @date 2022/2/10 17:34
 */
public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }

        Map<Integer, Integer> dataMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (dataMap.containsKey(target - nums[i])) {
                result[0] = dataMap.get(target - nums[i]);
                result[1] = i;
                break;
            }
            dataMap.put(nums[i], i);
        }
        return result;
    }
}