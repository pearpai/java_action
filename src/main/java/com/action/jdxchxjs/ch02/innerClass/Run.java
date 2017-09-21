package com.action.jdxchxjs.ch02.innerClass;

/**
 * Created by wuyunfeng on 2017/9/19.
 */
public class Run {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUserName("userNameValue");
        publicClass.setPassword("passwordValue");

        System.out.println(publicClass.getUserName()+ " " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();

        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");

        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());

        PublicClass.PrivateClass2 privateClass2 = new PublicClass.PrivateClass2();



    }

}
