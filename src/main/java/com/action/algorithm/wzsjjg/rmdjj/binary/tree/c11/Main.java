package com.action.algorithm.wzsjjg.rmdjj.binary.tree.c11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 13. 11月 2019 16:13
 */
@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) throws InterruptedException {
        BST11<Integer> bst = new BST11<>();


        Random random = new Random();
        int n = 1000;
        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }

        List<Integer> nums = new ArrayList<>();

//        while (!bst.isEmpty()){
//            nums.add(bst.removeMin());
//        }
//
//        for (int i = 1; i < nums.size(); i++) {
//            if (nums.get(i-1)> nums.get(i)){
//                throw new InterruptedException("error -----test completed");
//            }
//        }


        while (!bst.isEmpty()){
            nums.add(bst.removeMax());
        }

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i-1)< nums.get(i)){
                throw new InterruptedException("error -----test completed");
            }
        }

        System.out.println(nums);

    }

}
