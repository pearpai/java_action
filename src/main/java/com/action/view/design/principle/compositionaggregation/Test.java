package com.action.view.design.principle.compositionaggregation;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 21:03
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao(new MySQLConnection());
        productDao.addProduct();
    }

}
