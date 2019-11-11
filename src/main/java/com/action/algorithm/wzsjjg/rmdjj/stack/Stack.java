package com.action.algorithm.wzsjjg.rmdjj.stack;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 24. 10月 2019 14:02
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();


}
