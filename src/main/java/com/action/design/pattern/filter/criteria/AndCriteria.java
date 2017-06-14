package com.action.design.pattern.filter.criteria;

import java.util.List;

/**
 * Created by wuyunfeng on 2017/6/14.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(people);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
