package com.action.effectivejava3.item30;

import java.util.*;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 09. 8月 2019 10:22
 */
public class Union {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>() {
            private static final long serialVersionUID = 1133317968279072967L;

            {
                add("Tom");
                add("Dick");
                add("Harry");
            }
        };
        Set<String> stooges = new HashSet<String>() {
            private static final long serialVersionUID = -3648477074603707018L;

            {
                add("Larry");
                add("Moe");
                add("Curly");
            }
        };
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

    }

}
