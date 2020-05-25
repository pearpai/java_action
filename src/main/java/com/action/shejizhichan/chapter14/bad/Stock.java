package com.action.shejizhichan.chapter14.bad;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:56
 * @Version 1.0
 */
public class Stock {

    // 刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;
    // 库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 库存降低
    public void deCrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    // 存货压力大了，就要通知采购人员不需要采购，销售人员尽快销售
    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        // 要求折价销售
        sale.offSale();
        // 要求采购人员不要采购
        purchase.refuseBuyIBM();
    }

}
