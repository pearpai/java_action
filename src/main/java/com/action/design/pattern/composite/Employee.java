package com.action.design.pattern.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建Employee类，该类带有Employee对象列表
 * Created by wuyunfeng on 2017/6/14.
 */
@Data
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
