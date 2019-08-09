package com.action.effectivejava3.item29.technqiue1;

import com.action.effectivejava3.item29.EmptyStackException;

import java.util.Arrays;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 09. 8月 2019 09:54
 */
public class StackOld {

    private Object[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackOld() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        new StackOld();
    }

}
