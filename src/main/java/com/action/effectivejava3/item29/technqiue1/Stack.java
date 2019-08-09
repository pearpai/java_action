package com.action.effectivejava3.item29.technqiue1;

import com.action.effectivejava3.item29.EmptyStackException;

import java.util.Arrays;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 09. 8月 2019 09:54
 */
public class Stack<E> {

    private E[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
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

        String[] strings = {"a", "b", "c", "d"};

        Stack<String> stack = new Stack<>();
        for (String arg : strings) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }

}
