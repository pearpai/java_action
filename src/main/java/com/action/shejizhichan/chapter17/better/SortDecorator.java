package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:40
 * @Version 1.0
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // 在老板看完毕成绩单后，我在汇报学校都排名状况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
