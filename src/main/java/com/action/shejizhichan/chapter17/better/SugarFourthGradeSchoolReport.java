package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:23
 * @Version 1.0
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {

    // 首先要定义你要美化的方法，先给老爸说学校最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高分是75， 数学是78，自然是80");
    }

    // 在老板看完毕成绩单后，我在汇报学校都排名状况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
