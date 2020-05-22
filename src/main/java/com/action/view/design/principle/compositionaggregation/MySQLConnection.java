package com.action.view.design.principle.compositionaggregation;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 21:06
 * @Version 1.0
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
