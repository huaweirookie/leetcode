package com.zhunongyun.toalibaba.leetcode;

import java.util.Arrays;
import java.util.Collections;

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
     * @param data
     * @return
     */
    public static ListNode translateToListNode(Integer ... data) {
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
     * ListNode 转换成 String
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
     * 生成 int[]
     * @param data
     * @return
     */
    public static int[] translateToIntList(Integer ... data) {
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
     * int[] 转换成 String
     * @param data
     * @return
     */
    public static String translateIntToString(int[] data) {
        if (null == data || data.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int datum : data) {
            sb.append(datum);
        }
        return sb.toString();
    }
}