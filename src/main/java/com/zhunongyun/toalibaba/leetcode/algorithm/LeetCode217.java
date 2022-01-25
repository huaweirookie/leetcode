package com.zhunongyun.toalibaba.leetcode.algorithm;

import org.springframework.util.Assert;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>(nums.length);
        for (int data : nums) {
            if (!set.add(data)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode217 leetCode217 = new LeetCode217();
        Assert.isTrue(leetCode217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}), "失败");
        Assert.isTrue(!leetCode217.containsDuplicate(new int[]{1,2,3,4,5}), "失败");
    }
}
