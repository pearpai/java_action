package com.action.shejizhichan.chapter25.total;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(visitor);
        }
        System.out.println("本公司员工工资总额是：" + visitor.getTotalSalary());
    }


    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();


        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领，苦工加搬运");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);


        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("页面美工，审美素质太流行了");
        lisi.setName("李四");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMALE);
        empList.add(lisi);

        Manager wangWu = new Manager();
        wangWu.setPerformance("基本上是负值，但是我会拍马屁啊");
        wangWu.setName("王五");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);

        return empList;
    }


}
