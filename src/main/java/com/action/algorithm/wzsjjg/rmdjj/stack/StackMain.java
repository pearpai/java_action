package com.action.algorithm.wzsjjg.rmdjj.stack;

/**
 * Summary:
 * Created by wuyunfeng on 24. 10月 2019 14:23.
 */
public class StackMain {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.toString());
        }
        stack.pop();
        System.out.println(stack.toString());
    }

}
