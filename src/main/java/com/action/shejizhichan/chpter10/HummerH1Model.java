package com.action.shejizhichan.chpter10;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 13:16
 * @Version 1.0
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
