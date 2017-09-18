package com.action.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 手写arrayList
 * Created by wuyunfeng on 2017/9/18.
 */
public class DemoArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private T[] theItems = (T[]) new Object[]{};

    /**
     * 返回list长度
     *
     * @return int
     */
    public int size() {
        return theSize;
    }

    /**
     * 判断是否为空
     *
     * @return bool
     */
    public boolean isEmpty() {
        return theSize == 0;
    }

    public void ensureCapacity(int newCapacity) {

        if (newCapacity < theSize) {
            return;
        }
        T[] old = theItems;
        theItems = (T[]) new Object[newCapacity];
        System.arraycopy(old, 0, theItems, 0, size());
    }

    public DemoArrayList() {
        clear();
    }

    public void clear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }


    public void trimToSize() {
        ensureCapacity(size());
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            return theItems[idx];

        }
    }

    public T set(int idx, T newVal) {
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            T old = theItems[idx];
            theItems[idx] = newVal;
            return old;
        }
    }

    public boolean add(T x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, T x) {

        if (theItems.length == size()) {
            ensureCapacity(size() * 2 + 1);
        }

        System.arraycopy(theItems, theSize - 1, theItems, theSize, idx - theSize);
        theItems[idx] = x;
        theSize++;
    }

    public T remove(int idx){
        T removedItem = theItems[idx];
        for (int i = idx; i < size() -1 ; i++) {
            theItems[i] = theItems[i+1];
        }
        theSize--;
        return removedItem;
    }


    public static void main(String[] args) {
        DemoArrayList arrayList = new DemoArrayList<Integer>();
        System.out.println(arrayList.size());
        arrayList.add(1);
        System.out.println(arrayList.size());

        List arrays = new ArrayList();

    }

}











