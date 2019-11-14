package com.action.algorithm.wzsjjg.rmdjj.setandmap.setbasicsandbstset;

import com.action.algorithm.wzsjjg.rmdjj.setandmap.Set;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 14. 11月 2019 08:25
 */
public class BSTSET<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSET() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
