package com.zhunongyun.toalibaba.leetcode.algorithm;

import org.springframework.util.Assert;

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

    public static void main(String[] args) {
        LeetCode1 leetCode1 = new LeetCode1();
        System.out.println(leetCode1.twoSum(new int[]{2,7,11,15}, 9));
        System.out.println(leetCode1.twoSum(new int[]{3,2,4}, 6));
    }
}
