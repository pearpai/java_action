package com.action.shejizhichan.chapter14.zhongjiezhe;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:56
 * @Version 1.0
 */
public class Stock extends AbstractColleague {

    // 刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    // 库存增加
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 库存降低
    public void deCrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    // 存货压力大了，就要通知采购人员不需要采购，销售人员尽快销售
    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }

}
