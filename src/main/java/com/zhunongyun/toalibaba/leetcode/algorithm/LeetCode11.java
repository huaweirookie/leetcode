package com.zhunongyun.toalibaba.leetcode.algorithm;

import org.springframework.util.Assert;

public class LeetCode11 {

    public int maxArea(int[] height) {
        int result = 0;

        if (null == height || height.length < 2) {
            return result;
        }

        int i = 0, j = height.length - 1;

        while (i < j) {
            result = height[i] > height[j]
                    ? Math.max(result, (j - i) * height[j--])
                    : Math.max(result, (j - i) * height[i++]);
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode11 leetCode11 = new LeetCode11();
        Assert.isTrue(49 == leetCode11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), "失败");
        Assert.isTrue(16 == leetCode11.maxArea(new int[]{4,3,2,1,4}), "失败");
        Assert.isTrue(2 == leetCode11.maxArea(new int[]{1,2,1}), "失败");
    }
}
