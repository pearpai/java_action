package com.action.algorithm.wzsjjg.rmdjj.binary.tree.c5;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 13. 11月 2019 08:52
 */
@SuppressWarnings("DuplicatedCode")
public class BST5<E extends Comparable<E>> {

    private class Node {
        public E e;

        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST5() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 向二分搜索树中添加新元素e
     *
     * @param e
     */
    public void add(E e) {
        add(root, e);
    }


    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;


    }

    /**
     * 是否包含某个元素
     *
     * @param e
     * @return
     */
    private boolean contains(E e) {

        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }

        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

}























