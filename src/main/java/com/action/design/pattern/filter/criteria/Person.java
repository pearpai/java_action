package com.action.design.pattern.filter.criteria;

import lombok.Data;

/**
 *
 * Created by wuyunfeng on 2017/6/14.
 */
@Data
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
