package com.action.threads.bfbcsz.chapter4;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wuyunfeng on 2017/6/29.
 */
public class PersonSetTest {

    public static void main(String[] args) {
        PersonSet personSet = new PersonSet();

//        PersonSet.Person person = new PersonSet.Person(){
//            @Override
//            public void doSomething() {
//                System.out.println("do -----------------");
//            }
//        };

        PersonSet.Person person = () -> System.out.println("do -----------------");

        personSet.addPerson(person);
        person.doSomething();

        System.out.println(personSet.containsPerson(person));
        Collections.unmodifiableMap(new HashMap<>());

        new CopyOnWriteArrayList<PersonSet.Person>();
//         ConcurrentMap<String, String>;




    }

}
