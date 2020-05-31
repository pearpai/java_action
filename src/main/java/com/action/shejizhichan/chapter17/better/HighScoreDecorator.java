package com.action.shejizhichan.chapter17.better;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 18:40
 * @Version 1.0
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高分是75， 数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
