package com.action.gaobingfachenxusheji.chapter02;

public class P32 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Hello, I am t1"));
        t1.start();
    }

}
