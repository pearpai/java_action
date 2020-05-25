package com.action.shejizhichan.chapter14.zhongjiezhe;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 8:31
 * @Version 1.0
 */
public class Mediator extends AbstractMediator {

    // 中介者最重要的方法
    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy":
                // 采购电脑
                this.buyComputer((Integer) objects[0]);
                break;
            case "sale.sell":
                // 采购电脑
                this.sellComputer((Integer) objects[0]);
                break;
            case "sale.offsell":
                // 采购电脑
                this.offSale();
                break;
            case "stock.clear":
                // 采购电脑
                this.clearStock();
                break;
            default:
                break;
        }
    }


    // 采购电脑
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        // 电脑销售情况
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {// 销售不好
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            super.stock.increase(buyNumber);
        }
    }

    // 销售电脑
    public void sellComputer(int number) {


        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        super.stock.deCrease(number);
    }


    // 折价处理
    public void offSale() {
        // 库房有多少卖多少
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    // 存货压力大了，就要通知采购人员不需要采购，销售人员尽快销售
    public void clearStock() {

        // 要求折价销售
        super.sale.offSale();
        // 要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }

}
