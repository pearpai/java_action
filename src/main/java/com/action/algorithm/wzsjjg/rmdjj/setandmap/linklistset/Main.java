package com.action.algorithm.wzsjjg.rmdjj.setandmap.linklistset;

import com.action.algorithm.wzsjjg.rmdjj.setandmap.setbasicsandbstset.BSTSET;
import com.action.utils.FileOperation;

import java.util.ArrayList;

/**
 * Summary:
 * Created by wuyunfeng on 14. 11月 2019 08:30.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("/Users/wuyunfeng/Documents/workspace/java_action/src/main/resources/pride-and-prejudice.txt", words1);
        System.out.println("Total words: " + words1.size());


        LinkedListSet<String> set1 = new LinkedListSet<>();
        for (String word:words1) {
            set1.add(word);
        }
        System.out.println("Total different words: " + set1.getSize());

        words1.clear();


        FileOperation.readFile("/Users/wuyunfeng/Documents/workspace/java_action/src/main/resources/a-tale-of-two-cities.txt", words1);
        System.out.println("Total words: " + words1.size());


        LinkedListSet<String> set2 = new LinkedListSet<>();
        for (String word:words1) {
            set2.add(word);
        }
        System.out.println("Total different words: " + set2.getSize());

    }

}
