package com.action.shejizhichan.chapter25.mult;

public class Visitor implements IVisitor {

    // 部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    // 普通员工的工资系数是2
    private final static int COMMONEMPLOYE_COEFFICIENT = 2;
    // 普通员工的工资总和
    private int commonTotalSalary = 0;
    // 计算部门经理的工资总和
    private int managerTotalSalary = 0;

    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYE_COEFFICIENT;
    }

    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    // 访问普通员工，打印出报表
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        this.calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        this.calManagerSalary(manager.getSalary());
    }

    // 组装基础信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }


    // 组装出部门经理的信息
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        return basicInfo + "业绩：" + manager.getPerformance() + "\t";
    }

    // 组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        return basicInfo + "工作：" + commonEmployee.getJob() + "\t";
    }

}
