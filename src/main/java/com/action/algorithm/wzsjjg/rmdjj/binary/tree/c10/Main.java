package com.action.algorithm.wzsjjg.rmdjj.binary.tree.c10;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 13. 11月 2019 16:13
 */
@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {
        BST10<Integer> bst = new BST10<>();

        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        // 前序遍历
        bst.preOrder();
        System.out.println();
        bst.preOrderNR();
        System.out.println();

        System.out.println(bst);

        System.out.println();

        bst.inOrder();

        System.out.println();

        bst.postOrder();

        System.out.println();

        bst.levelOrder();
    }

}
