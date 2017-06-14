package com.action.design.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了Criteria接口实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class CriteriaMale implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> malePersons = new ArrayList<>();

        people.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        });

        return malePersons;
    }
}
