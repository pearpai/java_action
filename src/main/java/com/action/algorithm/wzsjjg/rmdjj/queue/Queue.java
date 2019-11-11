package com.action.algorithm.wzsjjg.rmdjj.queue;

/**
 * Summary:
 * Created by wuyunfeng on 24. 10月 2019 15:16.
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
