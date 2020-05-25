package com.action.shejizhichan.chapter14.bad;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:56
 * @Version 1.0
 */
public class Purchase {

    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        // 访问数据库
        Stock stock = new Stock();
        // 访问销售
        Sale sale = new Sale();

        // 电脑销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            stock.increase(number);
        } else {// 销售不好
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            stock.increase(number);
        }
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
