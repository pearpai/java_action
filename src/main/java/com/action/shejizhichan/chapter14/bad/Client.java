package com.action.shejizhichan.chapter14.bad;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:17
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 采购员采购电脑
        System.out.println("---------采购人员采购电脑----------");
        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(100);
        // 销售人员销售电脑
        System.out.println("---------销售人员销售电脑----------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        // 库房管理人员清库存处理
        System.out.println("---------库房管理人员清库存处理----------");
        Stock stock = new Stock();
        stock.clearStock();
    }

}
