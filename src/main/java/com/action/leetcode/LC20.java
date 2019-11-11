package com.action.leetcode;

import java.util.Objects;
import java.util.Stack;

/**
 * Summary:
 * Created by wuyunfeng on 24. 10月 2019 14:38.
 */
public class LC20 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

//        for (int i = 0; i < s.length(); i++) {
//            Character a = s.charAt(i);
//            if (Objects.equals(a, '(') || Objects.equals(a, '[') || Objects.equals(a, '{')) {
//                stack.push(a);
//            } else {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                Character pop = stack.pop();
//                boolean check = (Objects.equals(pop, '(') && Objects.equals(')', a))
//                        || (Objects.equals(pop, '[') && Objects.equals(']', a))
//                        || (Objects.equals(pop, '{') && Objects.equals('}', a));
//                if (!check) {
//                    return false;
//                }
//            }
//
//        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                boolean check = (pop == '(' && ')' == a)
                        || (pop == '[' && ']' == a)
                        || (pop == '{' && '}' == a);
                if (!check) {
                    return false;
                }
            }

        }



        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
    }

}
