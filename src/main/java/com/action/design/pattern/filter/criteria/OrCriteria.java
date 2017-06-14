package com.action.design.pattern.filter.criteria;

import java.util.List;

/**
 * OrCriteria
 * Created by wuyunfeng on 2017/6/14.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(people);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(people);

        otherCriteriaItems.forEach(otherCriteriaItem ->{
            if (!firstCriteriaItems.contains(otherCriteriaItem))
                firstCriteriaItems.add(otherCriteriaItem);
        });

        return firstCriteriaItems;
    }
}
