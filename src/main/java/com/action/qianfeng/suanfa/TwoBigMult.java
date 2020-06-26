package com.action.qianfeng.suanfa;

public class TwoBigMult {


    public static void main(String[] args) {

        String a = "10001";
        String b = "9999999";


        char[] large = null;
        char[] small = null;

        if (a.length() >= b.length()) {
            large = a.toCharArray();
            small = b.toCharArray();
        } else {
            small = a.toCharArray();
            large = b.toCharArray();
        }

        int[] multi = new int[a.length() + b.length()];

        for (int j = small.length - 1; j >= 0; j--) {
            for (int i = large.length - 1; i >= 0; i--) {
                int num1 = small[j] - '0';
                int num2 = large[i] - '0';
                int x = num1 * num2;
                multi[large.length - 1 - i + small.length - 1 - j] += x;
            }
        }


    }

}
