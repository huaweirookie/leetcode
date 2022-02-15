package com.zhunongyun.toalibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 *
 * @author oscar
 * @date 2022/2/15 19:34
 */
public class LeetCode1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (null == matrix) {
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] minRow = new int[m];
        int[] maxCol = new int[n];

        Arrays.fill(minRow, Integer.MAX_VALUE);
        Arrays.fill(maxCol, 0);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minRow[i] = Math.min(matrix[i][j], minRow[i]);
                maxCol[j] = Math.max(matrix[i][j], maxCol[j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}