package com.action.effectivejava3.item30;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 09. 8月 2019 11:14
 */
public class RecursiveTypeBound {

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("Empty collection");
        }
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d"};
        List<String> argList = Arrays.asList(strings);
        System.out.println(max(argList));
    }

}
