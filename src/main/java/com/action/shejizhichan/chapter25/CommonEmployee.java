package com.action.shejizhichan.chapter25;

public class CommonEmployee extends Employee {

    // 工作内容，这个非常重要，以后的职业规划就靠它了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {
        return "工作：" + this.job + "\t";
    }
}
