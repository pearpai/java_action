package com.action.algorithm.wzsjjg.rmdjj.setandmap;

/**
 * Summary:
 * Created by wuyunfeng on 14. 11月 2019 17:50.
 */
public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    boolean contains(K key);

    V get(K key);

    void set(K key, V newValue);

    int getSize();

    boolean isEmpty();

}
