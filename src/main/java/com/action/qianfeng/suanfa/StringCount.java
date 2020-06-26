package com.action.qianfeng.suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringCount {


    public static void main(String[] args) {
//        test1();
//        test2();
//        char a = 80;
//        for (char i = 0; i < 127; i++) {
//            System.out.println((int)i + "-----" + i);
//        }

        test4();

    }


    public static void test1() {
        String str = "jlfasdjfalshflkasdhfksadhfuiashfhavjkhklausdhviouhoivoivviovioviviaidklqmwenwqewidoijf";
        Map<Character, Integer> map = new HashMap<>();
        char res = str.charAt(0);
        int max = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer count = map.get(c);
//            map.merge(c, 1, Integer::sum);
            if (count == null) {
                map.put(c, 1);
            } else {
                map.put(c, count + 1);
                if (count + 1 > max) {
                    max = count + 1;
                    res = str.charAt(i);
                }
            }
        }
        System.out.println(res + "  max=" + max);

    }

    private static void test2() {
        String str = "jlfasdjfalshflkasdhfksadhfuiashfhavjkhklausdhviouhoivoivviovioviviaidklqmwenwqewidoijf";
        Set<Character> set = new HashSet<>();


        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }


    private static void test3() {
        String str = "jlfasdjfalshflkasdhfksadhfuiashfhavjkhklausdhviouhoivoivviovioviviaidklqmwenwqewidoijf";
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {

        }

    }

    private static void test4() {

        String str = "我Abc梦的dabcdkk";

        int count = 10;
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int len = String.valueOf(str.charAt(i)).getBytes().length;
            System.out.println(len);
            if ((sum + len) <= count) {
                sum += len;
                System.out.println(sum);
                builder.append(str.charAt(i));
            } else {
                break;
            }
        }

        System.out.println(builder.toString());
//        System.out.println(str.charAt(0) + "=====" + String.valueOf(str.charAt(0)).getBytes().length);

    }

}
