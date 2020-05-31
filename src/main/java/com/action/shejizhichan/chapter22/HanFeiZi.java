package com.action.shejizhichan.chapter22;

public class HanFeiZi implements IHanFeiZi {

    // 韩非子是否在吃饭， 作为监控判断的标准
    private boolean isHavingBreakfast = false;

    // 韩非子是否在娱乐
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
