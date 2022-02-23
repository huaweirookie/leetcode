package com.zhunongyun.toalibaba.leetcode;

import java.util.List;

/**
 * ListNode 工具类
 *
 * @author oscar
 * @date 2022/1/26 10:38
 */
public class DataUtils {

    private DataUtils() {

    }

    /**
     * int[] 转换成 ListNode
     *
     * @param data
     * @return
     */
    public static ListNode translateToListNode(Integer... data) {
        if (null == data || data.length == 0) {
            return null;
        }

        ListNode result = new ListNode(-1);
        ListNode current = result;
        for (int datum : data) {
            current.next = new ListNode(datum);
            current = current.next;
        }
        return result.next;
    }

    /**
     * 生成 int[]
     *
     * @param data
     * @return
     */
    public static int[] translateToIntList(Integer... data) {
        if (null == data || data.length == 0) {
            return new int[0];
        }

        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            result[i] = data[i];
        }
        return result;
    }

    /**
     * 生成 int[][]
     *
     * @param data
     * @return
     */
    public static int[][] translateToIntList(int[]... data) {
        if (null == data || data.length == 0) {
            return new int[0][0];
        }

        int[][] result = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = data[i][j];
            }
        }
        return result;
    }

    /**
     * ListNode 转换成 String
     *
     * @param listNode
     * @return
     */
    public static String translateListNodeToString(ListNode listNode) {
        if (null == listNode) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        return sb.toString();
    }

    /**
     * List 转换成 String
     *
     * @param list
     * @return
     */
    public static String translateListToString(List<Integer> list) {
        if (null == list || list.isEmpty()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        return sb.toString();
    }

    /**
     * int[] 转换成 String
     *
     * @param data
     * @return
     */
    public static String translateListToString(int[] data) {
        if (null == data || data.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int datum : data) {
            sb.append(datum);
        }
        return sb.toString();
    }

    /**
     * int[] 转换成 String
     *
     * @param data
     * @return
     */
    public static String translateListAndListToString(List<List<Integer>> data) {
        if (null == data || data.isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        data.forEach(item -> {
            sb.append("[");
            item.forEach(temp -> {
                sb.append(temp).append(",");
            });
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append("]").append(",");
        });
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");

        return sb.toString();
    }
}