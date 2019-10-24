package com.action.effectivejava3.item31;

import com.action.effectivejava3.item29.EmptyStackException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

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

    /**
     * pushAll method without wildcart type - deficient
     *
     * @param src src
     */
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst){
        while (!isEmpty()){
            dst.add(pop());
        }
    }


    @SuppressWarnings("DuplicatedCode")
    public static void main(String[] args) {

        String[] strings = {"a", "b", "c", "d"};

        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        numberStack.pushAll(integers);
        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);
        System.out.println(objects);

    }

}
