package com.zhunongyun.toalibaba.leetcode;

/**
 * 11. 盛最多水的容器
 *
 * @author oscar
 * @date 2022/2/15 20:51
 */
public class LeetCode11 {

    public int maxArea(int[] height) {
        if (null == height || height.length == 0) {
            return 0;
        }

        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while (i < j) {
            int data = (j - i) * (height[i] <= height[j] ? height[i++] : height[j--]);
            max = Math.max(max, data);
        }
        return max;
    }
}
