package com.action.shejizhichan.chapter25.visitor;

public interface IVisitor {

    // 首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    // 其次定义一个我还可以访问部门经理
    public void visit(Manager manager);

}
