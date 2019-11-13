package com.action.algorithm.wzsjjg.rmdjj.binary.tree.c6;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 13. 11月 2019 16:13
 */
public class Main {

    public static void main(String[] args) {
        BST6<Integer> bst = new BST6<>();


        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num: nums){
            bst.add(num);
        }


        bst.preOrder();
        System.out.println();
        System.out.println(bst);


    }

}
