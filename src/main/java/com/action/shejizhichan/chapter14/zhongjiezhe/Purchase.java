package com.action.shejizhichan.chapter14.zhongjiezhe;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:56
 * @Version 1.0
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
