package com.action.design.pattern.interpreter;

/**
 * 创建表达式接口
 * Created by wuyunfeng on 2017/6/15.
 */
public interface Expression {

    boolean interpret(String context);

}
