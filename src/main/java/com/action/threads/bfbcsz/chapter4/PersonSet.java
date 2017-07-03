package com.action.threads.bfbcsz.chapter4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wuyunfeng on 2017/6/29.
 */
public class PersonSet {

    private final Set<Person> mySet = new HashSet<>();


    public synchronized void addPerson(Person person){
        mySet.add(person);
    }

    public synchronized boolean containsPerson(Person person){
        return mySet.contains(person);
    }

    interface Person{
        void doSomething();
    }

}
