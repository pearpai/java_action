package com.action.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Summary:
 * Created by wuyunfeng on 14. 11月 2019 16:54.
 */
public class LC804 {

    public static int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                int c = word.charAt(j) - 97;

                stringBuilder.append(codes[c]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }


    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
