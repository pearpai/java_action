package com.action.algorithm.wzsjjg.rmdjj.setandmap.setbasicsandbstset;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 13. 11月 2019 08:52
 */
@SuppressWarnings({"DuplicatedCode", "Duplicates"})
public class BST<E extends Comparable<E>> {


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

    public BST() {
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
        root = add(root, e);
    }


    /**
     * 第一个进入的node 每次返回都是当前节点的
     *
     * @param node
     * @param e
     * @return
     */
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
    public boolean contains(E e) {

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

    /**
     * 前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);

//        if (node != null) {
//            System.out.println(node.e);
//            preOrder(node.left);
//            preOrder(node.right);
//        }


    }

    /**
     * 前序遍历 非递归
     */
    public void preOrderNR() {

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null) {
                stack.push(cur.right);
            }

            if (cur.left != null) {
                stack.push(cur.left);
            }


        }

    }


    /**
     * 中序排列 排序树
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);

    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    /**
     * 层序遍历 广度遍历
     */
    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.remove();
            System.out.println(cur.e);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
    }

    public E miniMum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty");
        }
        return miniMum(root).e;
    }

    private Node miniMum(Node node) {
        if (node.left == null) {
            return node;
        }
        return miniMum(node.left);
    }

    public E maxMum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty");
        }
        return maxMum(root).e;
    }

    private Node maxMum(Node node) {
        if (node.right == null) {
            return node;
        }
        return maxMum(node.right);
    }

    // 删除最小值所在节点的值
    public E removeMin() {
        E ret = miniMum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    public E removeMax() {
        E ret = maxMum();
        root = removeMax(root);
        return ret;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node node, E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else { // e == node.e
            //
            if (node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size--;
                return  rightNode;
            }
            if (node.right == null){
                    Node leftNode = node.left;
                    node.left = null;
                    size--;
                    return leftNode;
            }

            Node successor = miniMum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;
            return successor;
        }

    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateBSTString(depth) + "null\n");
            return;
        }

        res.append(generateBSTString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);

    }

    private String generateBSTString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }
}























