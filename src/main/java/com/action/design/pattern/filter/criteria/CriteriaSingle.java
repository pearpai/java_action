package com.action.design.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了Criteria接口实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class CriteriaSingle implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> singlePersons = new ArrayList<>();

        people.forEach(person -> {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        });

        return singlePersons;
    }
}
