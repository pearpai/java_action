package com.action.design.pattern.interpreter;

/**
 * 创建实现了上述接口的实体类
 * Created by wuyunfeng on 2017/6/15.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
