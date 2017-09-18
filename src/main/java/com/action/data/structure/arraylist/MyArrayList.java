package com.action.data.structure.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyunfeng on 2017/8/28.
 */
public class MyArrayList<T> {

    List x = new ArrayList();
    // 双向链表节点
    class Node {
        Node before;
        T obj;
        Node behind;
    }

    Node head = null;
    Node tail = null;
    Node last = null;

    private int size = 0;


    private void addSize() {
        size++;
    }

    /**
     * 获取 list 长度
     * @return int size
     */
    public int size(){
        return size;
    }

    public void Add(T obj){
        Node node = new Node();
        // 当前没有数据
        if (head == null){
            node.obj = obj;
            head = node;
            last = node;
        }else {
            last.behind = node;
            node.before = last;
            tail = node;
            node.obj = obj;
        }
        addSize();
    }



}
