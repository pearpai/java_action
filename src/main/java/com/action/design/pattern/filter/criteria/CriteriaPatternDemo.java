package com.action.design.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用不同的标准（Criteria）和它们的结合起来过滤Person对象的列表
 * Created by wuyunfeng on 2017/6/14.
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Robert","Male", "Single"));
        people.add(new Person("John","Male", "Married"));
        people.add(new Person("Laura","Female", "Married"));
        people.add(new Person("Diana","Female", "Single"));
        people.add(new Person("Mike","Male", "Single"));
        people.add(new Person("Bobby","Male", "Single"));



        Criteria male = new CriteriaMale();
        Criteria female= new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(people));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(people));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(people));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(people));

    }

    public static void printPersons(List<Person> people){

        people.forEach(person -> System.out.println("Person : [ Name : " + person.getName()
                +", Gender : " + person.getGender()
                +", Marital Status : " + person.getMaritalStatus()
                +" ]"));

    }

}
