package com.action.algorithm.wzsjjg.rmdjj.setandmap.linklistmap;

import com.action.algorithm.wzsjjg.rmdjj.setandmap.Map;

/**
 * Summary:
 * Created by wuyunfeng on 14. 11月 2019 17:55.
 */
public class LinkedListMap<K, V> implements Map<K, V> {

    private class Node {
        public K key;
        public V value;
        private Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
            this(null, null, null);
        }
    }


    @Override
    public void add(K key, V value) {

    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void set(K key, V newValue) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
