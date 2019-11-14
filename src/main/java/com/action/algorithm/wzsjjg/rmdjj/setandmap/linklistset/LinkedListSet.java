package com.action.algorithm.wzsjjg.rmdjj.setandmap.linklistset;

import com.action.algorithm.wzsjjg.rmdjj.setandmap.Set;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 14. 11月 2019 08:48
 */
public class LinkedListSet<E> implements Set<E> {


    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if (!contains(e)){
            list.addFirst(e);
        }

    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
