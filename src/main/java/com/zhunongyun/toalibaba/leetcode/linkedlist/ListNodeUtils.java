package com.zhunongyun.toalibaba.leetcode.linkedlist;

/**
 * ListNode 工具类
 *
 * @author oscar
 * @date 2022/1/26 10:38
 */
public class ListNodeUtils {

    /**
     * int[] 转换成 ListNode
     * @param data
     * @return
     */
    public static ListNode translateToListNode(int[] data) {
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
    public static String translateToString(ListNode listNode) {
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
}
