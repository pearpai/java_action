package com.action.design.pattern.iterator;

/**
 * 使用NameRepository来获取迭代器，并打印名字
 * Created by wuyunfeng on 2017/6/15.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }

}
