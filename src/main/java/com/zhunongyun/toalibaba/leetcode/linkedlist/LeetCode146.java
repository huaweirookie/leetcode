package com.zhunongyun.toalibaba.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author oscar
 * @date 2022/1/27 15:29
 */
public class LeetCode146 {

    private int size;

    private int capacity;

    private Node head, tail;

    private Map<Integer, Node> cache = new HashMap<>();

    public LeetCode146(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node == null) {
            node = new Node(key, value);
            cache.put(key, node);
            addToHead(node);
            ++size;
            if (size > capacity) {
                node = tail.prev;
                removeNode(node);
                cache.remove(node.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        public Node(){
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}