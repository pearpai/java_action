package com.action.qianfeng.suanfa;

public class TwoBigAdd {


    public static void main(String[] args) {

//        String a = "10001";
//        String b = "9999999";


        String a = "10001";
        String b = "10001";

        char[] large = null;
        char[] small = null;

        if (a.length() >= b.length()) {
            large = a.toCharArray();
            small = b.toCharArray();
        } else {
            small = a.toCharArray();
            large = b.toCharArray();
        }


        int[] sums = new int[large.length + 1];


        for (int i = 0; i < large.length; i++) {
            sums[i] = large[large.length - i - 1] - '0';

            if (small.length >= (i + 1)) {
                sums[i] += small[small.length - i - 1] - '0';
            }
            System.out.println(sums[i]);
        }

        for (int i = 0; i < sums.length - 1; i++) {
            if (sums[i] > 9) {
                sums[i + 1] = sums[i + 1] + sums[i] / 10;
                sums[i] = sums[i] % 10;
            }
            System.out.print(sums[i]);
        }
        System.out.print(sums[sums.length - 1]);
        StringBuilder stringBuilder = new StringBuilder();
        if (sums[sums.length - 1] != 0) {
            stringBuilder.append(sums[sums.length - 1]);
        }
        for (int i = sums.length - 2; i >= 0; i--) {
            stringBuilder.append(sums[i]);
        }
        System.out.println();
        System.out.println(stringBuilder.toString());

    }


}
