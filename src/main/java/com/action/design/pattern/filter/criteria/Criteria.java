package com.action.design.pattern.filter.criteria;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口
 * Created by wuyunfeng on 2017/6/14.
 */
public interface Criteria {

    /**
     * 用户数据
     * @param people 人物
     */
    List<Person> meetCriteria(List<Person> people);

}
