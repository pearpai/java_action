package com.action.algorithm.wzsjjg.rmdjj.setandmap;

/**
 * Summary:
 * Created by wuyunfeng on 14. 11月 2019 08:24.
 */
public interface Set<E> {
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();

}
