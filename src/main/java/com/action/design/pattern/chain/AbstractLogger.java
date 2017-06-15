package com.action.design.pattern.chain;

/**
 * 创建抽象的记录器类
 * Created by wuyunfeng on 2017/6/15.
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
