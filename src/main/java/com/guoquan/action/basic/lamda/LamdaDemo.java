package com.guoquan.action.basic.lamda;

import java.util.Arrays;

/**
 * @Author wuyunfeng
 * @Date 2020/7/8 17:31
 */
public class LamdaDemo {

    @FunctionalInterface
    interface FunctionalInterfaceWithStaticMethod {
        static int sum(int[] array) {
            return Arrays.stream(array).reduce(Integer::sum).getAsInt();
        }

        void apply();


    }


    public static void main(String[] args) {
        int sum = FunctionalInterfaceWithStaticMethod.sum(new int[]{1, 2, 3, 4, 5});

        System.out.println(sum);
        FunctionalInterfaceWithStaticMethod f = () -> {
            System.out.println("=======");
        };
        f.apply();
        System.out.println(f);
    }
}
