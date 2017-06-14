package com.action.design.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了Criteria接口实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class CriteriaFemale implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> femalePersons = new ArrayList<>();

        people.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        });

        return femalePersons;
    }
}
