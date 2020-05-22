package com.action.view.design.principle.compositionaggregation;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 21:02
 * @Version 1.0
 */
public class ProductDao {

    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }


}
