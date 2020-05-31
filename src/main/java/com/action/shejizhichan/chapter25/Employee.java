package com.action.shejizhichan.chapter25;

/**
 * 抽象员工
 */
public abstract class Employee {
    // 0 男  1 女
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    // 甭管是谁，都有名字
    private String name;

    private int salary;

    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    // 打印出员工的信息
    public final void report() {
        String info = "姓名：" + this.name + "\t";
        info = info + "性别：" + (this.sex == FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + this.salary + "\t";
        info = info + getOtherInfo();
        System.out.println(info);
    }

    // 拼接员工的其他信息
    protected abstract String getOtherInfo();

}
