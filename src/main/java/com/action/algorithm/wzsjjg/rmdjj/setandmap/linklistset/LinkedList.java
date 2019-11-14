package com.action.algorithm.wzsjjg.rmdjj.setandmap.linklistset;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 28. 10月 2019 10:46
 */
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private Node tail;

    private int size;

    public LinkedList() {
        dummyHead = new Node();
        tail = dummyHead;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

//        dummyHead.next = new Node(e, dummyHead.next);
//        size++;
        add(0, e);
    }


    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }


        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;

    }

    public void addLast(E e) {
        add(size, e);
    }

    // 获得链表的第index(0-based)个位置的元素
    // 在链表中不是一个常用的操作，练习用：）
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    // 修改链表的第index(0-based)个位置的元素为e
    // 在链表中不是一个常用的操作，练习用：）
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.e = e;

    }

    public boolean contains(E e) {
        Node cur = dummyHead.next;

        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;


    }


    // 从链表中删除第一个元素, 返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从链表中删除最后一个元素, 返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
        Node prev = dummyHead.next;
        while (prev.next != null) {
            if (prev.next.e.equals(e)) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
        }


    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

//        Node cur = dummyHead.next;
//        while(cur != null){
//            res.append(cur + "->");
//            cur = cur.next;
//        }
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur).append("->");
        }
        res.append("NULL");

        return res.toString();
    }







}






















